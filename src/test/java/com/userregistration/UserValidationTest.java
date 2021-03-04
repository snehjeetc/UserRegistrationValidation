package com.userregistration;


import org.junit.Assert;
import org.junit.Test;


public class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturn_True() {
        UserValidator uservalidator = new UserValidator();
        boolean result = uservalidator.validateFirstName("Snehjeet");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Na");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturn_True(){
        UserValidator uservalidator = new UserValidator();
        boolean result = uservalidator.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturn_True() {
        UserValidator uservalidator = new UserValidator();
        boolean result = uservalidator.validatePhoneNumber("91 9919819801");
        Assert.assertTrue(result);
    }
}
