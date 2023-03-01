package com.bridgelab.user;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    // Scanner for user Input
    Scanner scan = new Scanner(System.in);

    // Method Checking FirstName with regex pattern
    public void checkFirstName() {
        System.out.println("Enter the first name :");
        String firstName = scan.nextLine();
        /*
         *  checking input is valid or not
         *  Name - First name starts with Cap and has minimum 3 characters
         */
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
            System.out.println("first name is valid");
        } else {
            System.out.println("first name invalid");
        }
    }
}
