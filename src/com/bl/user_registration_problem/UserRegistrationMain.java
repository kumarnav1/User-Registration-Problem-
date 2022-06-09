package com.bl.user_registration_problem;

import java.util.Scanner;

public class UserRegistrationMain {

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
    }
}