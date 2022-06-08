package com.bl.user_registration_problem;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";
    static boolean isFirstNameValid;

    public void validateFirstName(String firstName) {

        isFirstNameValid = Pattern.matches(FIRST_NAME, firstName);
        if (!isFirstNameValid) {

            System.out.println("First Name is not valid. Please enter first name in proper format.");
            System.exit(0);
        }
        System.out.println("Name is in correct format.");
    }
}