/*
 * generated by text 2.12.0
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import restInPeace.APIRest
import restInPeace.CommandRest
import restInPeace.Method
import restInPeace.Parameter
import java.util.HashSet
import org.eclipse.emf.common.util.EList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PythonGenerator extends AbstractGenerator {

	override void doGenerate(Resource res, IFileSystemAccess2 fsa, IGeneratorContext ctx){
		
		fsa.generateFile(res.URI.trimFileExtension.appendFileExtension("py").lastSegment,
		res.allContents.filter(APIRest).toIterable.head.compile.toString)
		
	}
	
	def dispatch compile(APIRest api) '''
	from flask import Flask, request
	from flask_negotiate import consumes, produces
	
	app = Flask(__name__)
	
	�FOR command : api.commands�
		�command.compile�
	�ENDFOR�
	
	if __name__ == '__main__':
	    app.run()'''
	
	def dispatch compile(CommandRest cmd) '''
	#
	#	�cmd.name� 
	#	�cmd.description� 
	#
	�FOR i : cmd.entryFormats�
	#	@input �i�
	�ENDFOR�
	�FOR o : cmd.outputFormats�
	#	@output �o�
	�ENDFOR�
	#	
	�FOR param : cmd.parameters�
		�param.compile�
	�ENDFOR�
	#
	
	@app.route('�cmd.path.path.toFlaskPath()�', methods=['�cmd.method�'])
	�cmd.entryFormats.toConsumes()�
	�cmd.outputFormats.toProduces()�
	def �cmd.name�
		return "Ceci est la r�ponse de la commande �cmd.name�", 200	
	
	'''
	
	def dispatch compile(Parameter p) '''
	#	@param �p.name� : �p.type�
	#		   �p.comment�
	#
	'''
	
	def String toLowerCase(Method method) {
		return method.toString().toLowerCase();
	}
	
	def String toFlaskPath(String path) {
		return path.replaceAll("\\{(\\w+)\\}", "<$1>");
	}
	
	def String toConsumes(EList<String> ef) {
		if(ef.isEmpty()) {
			return "";
		} else {
			return "@consumes('" + ef.join('\',\'') + "')";
		}
	}
	
	def String toProduces(EList<String> ef) {
		if(ef.isEmpty()) {
			return "";
		} else {
			return "@produces('" + ef.join('\',\'') + "')";
		}
	}
	
	// TODO: parenth�ses apr�s nom de m�thode
	// TODO: types des params
	// TODO: doc des m�thodes
	
	
}
