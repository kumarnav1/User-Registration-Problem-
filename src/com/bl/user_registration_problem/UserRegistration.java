package com.bl.user_registration_problem;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME = "^[A-Z][a-z]{2,}$";

    static boolean isFirstNameValid;
    static boolean isLastNameValid;

    public void validateFirstName(String firstName) {

        isFirstNameValid = Pattern.matches(FIRST_NAME, firstName);
        if (!isFirstNameValid) {

            System.out.println("First Name is not valid. Please enter first name in proper format.");
            System.exit(0);
        }
        System.out.println("First Name is in correct format.");
    }

    public void validateLastName(String lastName) {
        isLastNameValid = Pattern.matches(LAST_NAME, lastName);
        if (!isLastNameValid) {
            System.out.println("Last Name is invalid...Please enter proper last name");
            System.exit(0);
        }
        System.out.println("Last Name is in correct format.");
    }
}