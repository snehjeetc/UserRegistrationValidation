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
    public void givenLastName_WhenProper_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Na");
        Assert.assertFalse(result);
    }
}
