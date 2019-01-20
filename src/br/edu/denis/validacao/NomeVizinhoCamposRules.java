package br.edu.denis.validacao;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NomeVizinhoCamposRules implements ConstraintValidator<NomeVizinhoCampos,String>{

	@Override
	public void initialize(NomeVizinhoCampos annotation) {
		
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		System.out.println(value);
		if (!value.contains("vizinho")) {
			System.out.println("false");
			return false;
		}


		return true;
	}

}
