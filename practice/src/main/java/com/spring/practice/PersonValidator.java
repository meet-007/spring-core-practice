package com.spring.practice;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class PersonValidator implements Validator {

	/**
	 * This Validator validates *just* Person instances
	 */
	public boolean supports(final Class clazz) {
		return Person.class.equals(clazz);
	}

	public void validate(final Object obj, final Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
		final Person p = (Person) obj;
		if (p.getAge() < 0) {
			e.rejectValue("age", "negativevalue");
		} else if (p.getAge() > 110) {
			e.rejectValue("age", "too.darn.old");
		}
	}
}