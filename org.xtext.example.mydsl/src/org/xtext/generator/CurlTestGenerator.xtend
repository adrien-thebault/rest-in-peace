package org.xtext.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.emf.ecore.resource.Resource
import restInPeace.APIRest
import restInPeace.CommandRest
import restInPeace.Method

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
	
	def String genCurl(String string, String string2, CommandRest rest) {
		
		String s = "curl -X" + rest.method + " \"$HOST:$PORT" + path + "\"";
		// TODO : G PA FINI CURL
		return s;
		
	}
	
}