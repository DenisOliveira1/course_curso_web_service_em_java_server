package br.edu.denis.validacao;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//validacao de parametro recebido

@Documented
@Target(ElementType.PARAMETER)//so vai funcionar com parametros recebidos pela funcao
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CepParametrosRules.class)
public @interface CepParametros {
	
	String message() default "Cep invalido!"; // mensagem caso o cmapos eja invalido
	Class<?>[] groups() default {};
	Class<? extends Payload> [] payload() default {};
	

}
