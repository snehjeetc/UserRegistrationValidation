package com.userregistration;

import java.util.regex.*;

public class UserValidator {
    private final String VALID_NAME_REGEX = "^[A-Z][a-z]{2,}";
    private final String VALID_EMAIL_REGEX = "^([a-zA-Z0-9+-])+(\\.?[a-zA-Z0-9_+-])*@[a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?$";
    private final String VALID_PHONENUMBER_REGEX = "^(\\+?\\d{1,3}|\\d{1,4})\\s[1-9][0-9]{9}";
    private final String VALID_PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";


    public boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile(VALID_NAME_REGEX);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName){
        Pattern pattern = Pattern.compile(VALID_NAME_REGEX);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(VALID_EMAIL_REGEX);
        return pattern.matcher(email).matches();
    }

    public boolean validatePhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile(VALID_PHONENUMBER_REGEX);
        return pattern.matcher(phoneNumber).matches();
    }

    public boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(VALID_PASSWORD_REGEX);
        return pattern.matcher(password).matches();
    }
}
