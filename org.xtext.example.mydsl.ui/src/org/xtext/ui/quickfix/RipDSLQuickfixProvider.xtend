/*
 * generated by Xtext 2.12.0
 */
package org.xtext.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.xtext.validation.RipDSLValidator
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.emf.ecore.EObject
import restInPeace.CommandRest
import restInPeace.Parameter
import java.util.regex.Pattern
import java.util.HashSet
import restInPeace.impl.RestInPeaceFactoryImpl
import restInPeace.Path

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class RipDSLQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(RipDSLValidator.PARAMETER_NOT_DEFINED)
	def defineParamater(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Define parameter', 'Define the parameter', 'upcase.png', new ParameterDefiner())
	}
	
	@Fix(RipDSLValidator.PATH_MUST_BEGINS_WITH_SLASH)
	def appendSlashToPath(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Append a slash to the path', 'Append a slash to the path', 'upcase.png', new SlashAppender())
	}
}

class SlashAppender implements ISemanticModification{
	
	override apply(EObject element, IModificationContext context) throws Exception {
		if(element instanceof Path){
			val p = element as Path;
			p.path = "/" + p.path
		}
	}
	
}

class ParameterDefiner implements ISemanticModification{
	
	override apply(EObject element, IModificationContext context){
		if (element instanceof CommandRest) {
			val command = element as CommandRest
			var path = command.path.path
			val matcher = Pattern.compile("/\\{(\\w+)\\}/?").matcher(path);
			while(matcher.find()){
				val parName = matcher.group(1)
				val set = new HashSet<String>()
				for(Parameter p : command.parameters){
					set.add(p.name)
				}
				
				// TODO Ajouter les sauts de lignes
				
				if(!set.contains(parName)){
					val param = RestInPeaceFactoryImpl.eINSTANCE.createParameter
					param.name = parName;
					param.type = "int";
					param.comment = "Automatically generated parameter"
					command.parameters.add(param)
				}
				
			}
		}	
	}
}
