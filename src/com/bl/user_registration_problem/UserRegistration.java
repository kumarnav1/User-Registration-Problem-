package com.bl.user_registration_problem;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL = "[a-zA-Z0-9][a-zA-Z-0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z-0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?";
    private static final String PHONE_NUMBER = "[0-9]{2}\\s[1-9][0-9]{9}$";
    private static final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.{8,})([\\w]*[\\W][\\w]*)";

    static boolean isInputValid;

    public void validateFirstName(String firstName) {

        isInputValid = Pattern.matches(FIRST_NAME, firstName);
        if (!isInputValid) {

            System.out.println("First Name is not valid. Please enter first name in proper format.");
            return;
        }
        System.out.println("First Name is in correct format.");
    }

    public void validateLastName(String lastName) {

        isInputValid = Pattern.matches(LAST_NAME, lastName);
        if (!isInputValid) {
            System.out.println("Last Name is invalid. Please enter last name in proper format.");
            return;
        }
        System.out.println("Last Name is in correct format.");
    }

    public void validateEmail(String mail) {

        isInputValid = Pattern.matches(EMAIL, mail);
        if (!isInputValid) {
            System.out.println(mail + "     E-mail is invalid. Please enter e-mail in proper format.");
            return;
        }
        System.out.println(mail + "      Email is in correct format.");
    }

    public void validatePhoneNumber(String phoneNumber) {

        isInputValid = Pattern.matches(PHONE_NUMBER, phoneNumber);
        if (!isInputValid) {
            System.out.println("Phone number format is invalid. Please enter phone number in proper format.");
            return;
        }
        System.out.println("Phone number is in correct format.");
    }

    public void validatePassword(String password) {

        isInputValid = Pattern.matches(PASSWORD, password);
        if (!isInputValid) {
            System.out.println( password +  "       Password format is invalid. Please enter password in proper format.");
            return;
        }
        System.out.println(password + "       Password is in correct format.");
    }
}