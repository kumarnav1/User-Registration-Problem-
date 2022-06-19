package com.bl.user_registration_problem;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    public void validateFirstNameHappy() throws InvalidInputException {
        Assert.assertTrue(registration.validateFirstName("Navneet"));
    }

    @Test(expected = InvalidInputException.class)
    public void validateFirstNameSad() throws InvalidInputException {
        Assert.assertFalse(registration.validateFirstName("navneet"));
    }

    @Test
    public void validateLastNameHappy() throws InvalidInputException {
        Assert.assertTrue(registration.validateLastName("Kumar"));
    }

    @Test(expected = InvalidInputException.class)
    public void validateLastNameSad() throws InvalidInputException {
        Assert.assertFalse(registration.validateLastName("kumar"));
    }

    @Test
    public void validateEmailHappy() throws InvalidInputException {
        Assert.assertTrue(registration.validateEmail("navkr007@gmail.com"));
    }

    @Test
    public void validateEmailSad() throws InvalidInputException {
        Assert.assertFalse(registration.validateEmail("navkr007@@@gmail.com"));
    }

    @Test
    public void validatePhoneNumberHappy() throws InvalidInputException {
        Assert.assertTrue(registration.validatePhoneNumber("91 9304093785"));
    }

    @Test(expected = InvalidInputException.class)
    public void validatePhoneNumberSad() throws InvalidInputException {
        Assert.assertFalse(registration.validatePhoneNumber("87 457845"));
    }

    @Test
    public void validatePasswordHappy() throws InvalidInputException {
        Assert.assertTrue(registration.validatePassword("ajdkf$Jdfds9798"));
    }

    @Test(expected = InvalidInputException.class)
    public void validatePasswordSad() throws InvalidInputException {
        Assert.assertFalse(registration.validatePassword("dkfjd434343#$343"));
    }
}