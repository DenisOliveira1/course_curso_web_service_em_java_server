package br.edu.denis.validacao;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//validacao de campo

@Documented
@Target(ElementType.FIELD)//so vai funcionar com variaveis atribuidas a um objeto 
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NomeVizinhoCamposRules.class)
public @interface NomeVizinhoCampos {
	
	String message() default "Nome vizinho invalido!"; // mensagem caso o campo seja invalido
	Class<?>[] groups() default {};
	Class<? extends Payload> [] payload() default {};
	

}
