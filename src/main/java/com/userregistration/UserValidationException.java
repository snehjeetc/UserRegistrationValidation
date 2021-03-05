package com.userregistration;

public class UserValidationException extends Exception{

    enum ValidationExceptionType{
        INVALID_FIRST_NAME,
        INVALID_LAST_NAME,
        INVALID_EMAIL,
        INVALID_PHONE_NUMBER,
        INVALID_PASSWORD;
    }

    ValidationExceptionType type;

    public UserValidationException(ValidationExceptionType type, String message) {
        super(type.toString() + ": " + message);
        this.type = type;
    }
}
