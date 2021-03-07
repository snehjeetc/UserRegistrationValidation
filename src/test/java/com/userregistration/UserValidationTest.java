package com.userregistration;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.PrintStream;


public class UserValidationTest {
    private UserValidator userValidator;

    @Before
    public void initialize(){
        userValidator = new UserValidator();
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturn_True() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationException.class);
            boolean result = userValidator.validateFirstName("Snehjeet");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturn_False(){
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationException.class);
            boolean result = userValidator.validateFirstName("snehjeet");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturn_False() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationException.class);
            boolean result = userValidator.validateLastName("Na");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturn_True(){
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationException.class);
            boolean result = userValidator.validateLastName("Chatterjee");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturn_True(){
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationException.class);
            boolean result = userValidator.validateEmail("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturn_False(){
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationException.class);
            boolean result = userValidator.validateEmail("abc.@gmail.com");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturn_True() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationException.class);
            boolean result = userValidator.validatePhoneNumber("91 9919819801");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturn_False(){
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationException.class);
            boolean result = userValidator.validatePhoneNumber("919999998888");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturn_True(){
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationException.class);
            boolean result = userValidator.validatePassword("abcA#12foRca");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturn_False(){
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationException.class);
            boolean result = userValidator.validatePassword("abc123di");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }
}
