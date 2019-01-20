package br.edu.denis.validacao;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CepParametrosRules implements ConstraintValidator<CepParametros,String>{

	@Override
	public void initialize(CepParametros annotation) {
		
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		/*
		System.out.println(value == null);
		System.out.println(value.length() != 8);
		System.out.println(value.charAt(0) != '2');
		*/

		if (value == null) {
			return false;
		}
		
		if (value.length() != 8) {
			return false;
		}
		
		if (value.charAt(0) != '2') {//'' para char
			return false;
		}

		
		return true;
	}

}
