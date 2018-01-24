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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RipDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource res, IFileSystemAccess2 fsa, IGeneratorContext ctx){
		
		fsa.generateFile(res.URI.trimFileExtension.appendFileExtension("js").lastSegment,
		res.allContents.filter(APIRest).toIterable.head.compile.toString)
		
	}
	
	def dispatch compile(APIRest api) '''
	var express = require('express');
	var app = express();
	
	�FOR command : api.commands�
		�command.compile�
	�ENDFOR�
	
	var server = app.listen(�api.port�, '�api.host�', function () {	})'''
	
	def dispatch compile(CommandRest cmd) '''
	/* 
	*
	*	�cmd.name� 
	*	�cmd.description� 
	*
	�FOR i : cmd.entryFormats�
	*	@input �i�
	�ENDFOR�
	�FOR o : cmd.outputFormats�
	*	@output �o�
	�ENDFOR�
	*	
	�FOR param : cmd.parameters�
		�param.compile�
	�ENDFOR�
	*
	*/
	
	app.�cmd.method.toLowerCase()�('�cmd.path.toExpressPath()�', function(req, res) {
		
		�FOR i : cmd.entryFormats�
		if(req.is("�i�")) {
			// TODO
		}
		�ENDFOR�
		
		res.end("Ceci est la r�ponse de la commande �cmd.name�");
		
	})
	
	
	'''
	
	def dispatch compile(Parameter p) '''
	*	@param �p.name� : �p.type�
	*		   �p.comment�
	*
	'''
	
	def String toLowerCase(Method method) {
		return method.toString().toLowerCase();
	}
	
	def String toExpressPath(String path) {
		return path.replaceAll("\\{(\\w+)\\}", ":$1");
	}
	
}
