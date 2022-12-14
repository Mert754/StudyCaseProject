package com.project.Fineros.Validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;



@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {UniqueEmailValid.class})
public @interface UniqueEmail  {
	String message() default "{fineros.constraints.UniqueEmail.message}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
