package cdr.forms;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class SupplementalObjectValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		 return SupplementalObject.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "field.required", "This field is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "medium", "field.required", "This field is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dimensions", "field.required", "This field is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "date", "field.required", "This field is required.");
	}

}
