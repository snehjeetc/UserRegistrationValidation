package com.userregistration;

import java.util.regex.*;

public class UserValidator {
    private final String VALID_NAME_REGEX = "^[A-Z][a-z]{2,}";

    public boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile(VALID_NAME_REGEX);
        return pattern.matcher(firstName).matches();
    }

}
