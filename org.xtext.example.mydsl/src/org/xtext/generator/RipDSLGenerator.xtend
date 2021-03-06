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
import javax.inject.Inject

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RipDSLGenerator extends AbstractGenerator {
	
	@Inject NodeJSGenerator nodejs
	@Inject PythonGenerator python
	@Inject CurlTestGenerator curl
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		curl.doGenerate(input, fsa, context);
    	nodejs.doGenerate(input, fsa, context);
    	python.doGenerate(input, fsa, context);
	}
	
}
