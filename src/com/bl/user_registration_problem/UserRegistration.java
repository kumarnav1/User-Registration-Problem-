package com.bl.user_registration_problem;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL = "[a-zA-Z0-9][a-zA-Z-0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z-0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?";

    static boolean isFirstNameValid;
    static boolean isLastNameValid;
    static boolean isMailValid;

    public void validateFirstName(String firstName) {

        isFirstNameValid = Pattern.matches(FIRST_NAME, firstName);
        if (!isFirstNameValid) {

            System.out.println("First Name is not valid. Please enter first name in proper format.");
            return;
        }
        System.out.println("First Name is in correct format.");
    }

    public void validateLastName(String lastName) {

        isLastNameValid = Pattern.matches(LAST_NAME, lastName);
        if (!isLastNameValid) {
            System.out.println("Last Name is invalid. Please enter last name in proper format.");
            return;
        }
        System.out.println("Last Name is in correct format.");
    }

    public void validateEmail(String mail) {

        isMailValid = Pattern.matches(EMAIL, mail);
        if (!isMailValid) {
            System.out.println(mail + "     E-mail is invalid. Please enter e-mail in proper format.");
            return;
        }
        System.out.println(mail + "      Email is in correct format.");
    }
}