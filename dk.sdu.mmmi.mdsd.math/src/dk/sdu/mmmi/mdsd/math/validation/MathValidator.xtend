/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math.validation


import org.eclipse.xtext.validation.Check
import dk.sdu.mmmi.mdsd.math.math.VarBinding
import dk.sdu.mmmi.mdsd.math.math.MathExp
import dk.sdu.mmmi.mdsd.math.math.MathPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MathValidator extends AbstractMathValidator {

	public static final String VAR_UNIQUE = 'var_unique'
	
	@Check
	def void uniqueGlobalVariableDefinition(VarBinding binding){
		if((binding.eContainer as MathExp).variables.filter[name == binding.name].size > 1)
			error("Duplicate global variable", MathPackage.eINSTANCE.binding_Name, VAR_UNIQUE)
	}
	
}
