package com.bridgelab.user;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    // Scanner for user Input
    Scanner scan = new Scanner(System.in);

    // Method Checking FirstName with regex pattern

    //UC1
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

    //UC2
    public void checkLastName() {
        System.out.println("Enter the Last name : ");
        String lastName = scan.nextLine();
        // Creating/Defining a pattern to be searched
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        // matcher searching the above pattern with lastName
        Matcher matcher = pattern.matcher(lastName);
        // matchFound store true if pattern matches
        boolean matchFound = matcher.find();
        // Name - Last name starts with Cap and has minimum 3 characters
        if (matchFound) {
            System.out.println("Last Name is valid");
        } else {
            System.out.println("Last Name invalid");
        }
    }
    //UC3
    // Method Checking Email with regex pattern
    public void checkEmail() {
        System.out.println("Enter the Email : ");
        String eMail = scan.nextLine();
        // Creating/Defining a pattern to be searched
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([.][0-9a-zA-Z]+)*@[a-zA-Z]+.[a-z]{2,3}([.][a-z]{2,3})*$");
        // matcher searching the above pattern with Email
        Matcher matcher = pattern.matcher(eMail);
        // matchFound store true if pattern matches
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid. Enter Email Again ");
            checkEmail();
        }
    }
}
