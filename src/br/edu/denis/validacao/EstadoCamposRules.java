package br.edu.denis.validacao;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EstadoCamposRules implements ConstraintValidator<EstadoCampos,String>{

	@Override
	public void initialize(EstadoCampos annotation) {
		
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		/*
		System.out.println(value);
		*/
		
		if (!value.contentEquals("MG")) {
			return false;
		}


		return true;
	}

}
