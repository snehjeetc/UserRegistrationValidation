package com.userregistration;

import java.util.regex.*;

public class UserValidator {
    private final String VALID_NAME_REGEX = "^[A-Z][a-z]{2,}";
    private final String VALID_EMAIL_REGEX = "^([a-zA-Z0-9+-])+(\\.?[a-zA-Z0-9_+-])*@[a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?$";
    private final String VALID_PHONENUMBER_REGEX = "^(\\+?\\d{1,3}|\\d{1,4})\\s[1-9][0-9]{9}";
    private final String VALID_PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    private Validator validator = (regexp, charSequence) -> Pattern.compile(regexp).matcher(charSequence).matches();

    public boolean validateFirstName(String firstName) throws UserValidationException{
        if(!validator.isValid(VALID_NAME_REGEX, firstName))
            throw new UserValidationException(UserValidationException.ValidationExceptionType.INVALID_FIRST_NAME, "Invalid first name");
        return true;
    }

    public boolean validateLastName(String lastName) throws UserValidationException{
        if(!validator.isValid(VALID_NAME_REGEX, lastName))
            throw new UserValidationException(UserValidationException.ValidationExceptionType.INVALID_LAST_NAME, "Invalid last name");
        return true;
    }

    public boolean validateEmail(String email) throws UserValidationException{
        if(!validator.isValid(VALID_EMAIL_REGEX, email))
            throw new UserValidationException(UserValidationException.ValidationExceptionType.INVALID_EMAIL, "Invalid email id");
        return true;
    }

    public boolean validatePhoneNumber(String phoneNumber) throws UserValidationException{
        if(!validator.isValid(VALID_PHONENUMBER_REGEX, phoneNumber))
            throw new UserValidationException(UserValidationException.ValidationExceptionType.INVALID_PHONE_NUMBER, "Invalid phone number");
        return true;
    }

    public boolean validatePassword(String password) throws UserValidationException{
        if(!validator.isValid(VALID_PASSWORD_REGEX, password))
            throw new UserValidationException(UserValidationException.ValidationExceptionType.INVALID_PASSWORD, "Invalid password");
        return true;
    }
}
