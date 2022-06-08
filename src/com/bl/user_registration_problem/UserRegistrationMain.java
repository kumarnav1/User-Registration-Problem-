package com.bl.user_registration_problem;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {

        System.out.println("Welcome to User Registration Problem");

        UserRegistration registration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First-Name: ");
        String firstName = scanner.next();
        registration.validateFirstName(firstName);
    }
}