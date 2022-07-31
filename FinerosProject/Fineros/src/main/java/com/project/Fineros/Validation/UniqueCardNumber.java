package com.project.Fineros.Validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {UniqueCardNumberValid.class})
public @interface UniqueCardNumber {
	String message() default "{fineros.constraints.UniqueField.message}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
