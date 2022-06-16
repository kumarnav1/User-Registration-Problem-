package com.bl.user_registration_problem;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    public void validateFirstNameHappy() {

        Assert.assertTrue(registration.validateFirstName("Navneet"));
    }

    @Test
    public void validateFirstNameSad() {

        Assert.assertFalse(registration.validateFirstName("navneet"));
    }

    @Test
    public void validateLastNameHappy() {

        Assert.assertTrue(registration.validateLastName("Kumar"));
    }

    @Test
    public void validateLastNameSad() {
        Assert.assertFalse(registration.validateLastName("kumar"));
    }

    @Test
    public void validateEmailHappy() {
        Assert.assertTrue(registration.validateEmail("navkr007@gmail.com"));
    }

    @Test
    public void validateEmailSad() {
        Assert.assertFalse(registration.validateEmail("navkr007@@@gmail.com"));
    }

    @Test
    public void validatePhoneNumberHappy() {
        Assert.assertTrue(registration.validatePhoneNumber("91 9304093785"));
    }

    @Test
    public void validatePhoneNumberSad() {
        Assert.assertFalse(registration.validatePhoneNumber("87 457845"));
    }

    @Test
    public void validatePasswordHappy() {
        Assert.assertTrue(registration.validatePassword("ajdkf$Jdfds9798"));
    }

    @Test
    public void validatePasswordSad() {
        Assert.assertFalse(registration.validatePassword("dkfjd434343#$343"));
    }
}