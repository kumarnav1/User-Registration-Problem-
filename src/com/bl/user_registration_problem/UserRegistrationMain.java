package com.bl.user_registration_problem;

import java.util.Scanner;

public class UserRegistrationMain {

    static final String[] ALL_MAIL_ID = {"abc@yahoo.com", "abc-100@yahoo.com",
            "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
            "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com",
            "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
            "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

    public static void main(String[] args) {

        System.out.println("Welcome to User Registration Problem");

        UserRegistration registration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First-Name: ");
        String firstName = scanner.next();
        registration.validateFirstName(firstName);

        System.out.println("Enter Last-Name: ");
        String lastName = scanner.next();
        registration.validateLastName(lastName);

        System.out.println("Enter Email: ");
        scanner.nextLine();
        String email = scanner.nextLine();
        registration.validateEmail(email);

        System.out.println("Enter Phone number: ");
        String phoneNumber = scanner.nextLine();
        registration.validatePhoneNumber(phoneNumber);

        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        registration.validatePassword(password);

        for (String emails : ALL_MAIL_ID) {

            registration.validateEmail(emails);
        }
    }
}