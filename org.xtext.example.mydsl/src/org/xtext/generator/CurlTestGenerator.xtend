package org.xtext.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.emf.ecore.resource.Resource
import restInPeace.APIRest
import restInPeace.CommandRest
import restInPeace.Method
import java.util.HashSet
import restInPeace.Parameter
import java.util.Iterator

class CurlTestGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource res, IFileSystemAccess2 fsa, IGeneratorContext ctx){
		
		fsa.generateFile(res.URI.trimFileExtension.appendFileExtension("sh").lastSegment,
		res.allContents.filter(APIRest).toIterable.head.compile.toString)
		
	}
	
	def dispatch compile(APIRest api) '''
	#!/bin/sh
	
	HOST="«api.host»"
	PORT="«api.port»"
	BASE_URL = "$HOST:$PORT"
	
	«FOR command : api.commands»
		«command.compile»
	«ENDFOR»
	
	'''
	
	def dispatch compile(CommandRest cmd) '''
	#	«cmd.name» 
	#	«cmd.description»
	
	«FOR i : cmd.entryFormats»
		«FOR o : cmd.outputFormats»
		«genCurl(i, o, cmd)»
		«ENDFOR»
	«ENDFOR»
	«genCurl(null, null, cmd)»
	
	'''
	
	def String genPath(CommandRest cmd, HashSet<Parameter> ps) {
		
		var s = cmd.path;
		
		var it1 = cmd.parameters.iterator();
		while(it1.hasNext()) {
			var p = it1.next();
			if(!ps.contains(p)) {
				if(p.type.toLowerCase().equals("int")) {
					s = s.replaceAll("\\{" + p.name + "\\}", "42");
				} else if(p.type.toLowerCase().equals("string")) {
					s = s.replaceAll("\\{" + p.name + "\\}", "ccsv");
				}
			}
		}
		
		if(cmd.method == Method.GET || cmd.method == Method.DELETE) {
		
			s += "?"
			var it = ps.iterator();
			while(it.hasNext()) {
				
				var p = it.next();
				s += p.name;
				
				if(p.type.toLowerCase().equals("int")) {
					s += "=42";
				} else if(p.type.toLowerCase().equals("string")) {
					s += "=ccsv";
				}
				
				if(it.hasNext()) s += "&";
				
			}
			
		}
		
		return s;
		
	}
	
	def String genCurl(String i, String o, CommandRest rest) {

		var HashSet<Parameter> non_url = new HashSet<Parameter>();
		for(Parameter p : rest.parameters) {
			if(!rest.path.contains("{" + p.name + "}")) non_url.add(p);
		}
		
		var s = "curl -X" + rest.method + " \"http://$HOST:$PORT" + genPath(rest, non_url) + "\"";
		
		if(o !== null) s += " -H \"Content-Type:" + o + "\" -d \"`cat mySampleData." + i.split('/').last + "`\"";
		if(i !== null) s += " -H \"Accept:" + i + "\"";
		
		return s;
		
	}
	
}