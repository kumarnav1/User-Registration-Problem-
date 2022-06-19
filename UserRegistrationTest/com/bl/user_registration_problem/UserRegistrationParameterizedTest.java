package com.bl.user_registration_problem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {

    private final String emailTest;
    private final boolean expectedResult;
    private UserRegistration registration;

    public UserRegistrationParameterizedTest(String emailTest, boolean expectedResult) {

        this.emailTest = emailTest;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testEmails() {
        return Arrays.asList(new Object[][]{

                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
        });
    }

    @Before
    public void setUp() {
        registration = new UserRegistration();
    }

    @Test
    public void givenEmailAsVariable_ShouldCheckTrue() throws InvalidInputException {
        Assert.assertEquals(expectedResult, registration.validateEmail(emailTest));
    }
}