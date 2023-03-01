package com.bridgelab.user;

import java.util.ArrayList;
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
    //UC4
    // Method Checking Mobile Number with Regex pattern
    public void checkMobileNumber() {
        System.out.println("Enter the Mobile Number : ");
        String mobileNumber = scan.nextLine();
        // Creating/Defining a pattern to be searched
        Pattern pattern = Pattern.compile("^[+][0-9]{2}+[ ]?[0-9]{10}$");
        // matcher searching the above pattern
        Matcher matcher = pattern.matcher(mobileNumber);
        // matchFound store true if pattern matches
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Mobile Number is valid");
        } else {
            System.out.println("Mobile Number is invalid. Enter Again: ");
            checkMobileNumber();
        }
    }
    //UC5 + uc6 +uc7 +uc8

    /* Method Checking Password Rules are minimum 8 characters, at least one upper case
     * at least one numeric*/
    public void checkPassword() {
        System.out.println("Enter the Password : ");
        String password = scan.nextLine();
        // Checking pattern with Password
        if (Pattern.matches("^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$", password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid. Enter Again: ");
            checkPassword();
        }
    }
    //UC9
//Method to check sample emails.
    public void checkSampleEmail() {
        System.out.println("Checking Sample Emails ");
        // array for emails
        ArrayList<String> email = new ArrayList<>();
        // valid EmailIDs
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.100@yahoo.com");
        email.add("abc111@abc.com");
        email.add("abc-100@abc.net");
        email.add("abc.100@abc.com.au");
        email.add("abc@1.com");
        email.add("abc@gmail.com.com");
        email.add("abc+100@gmail.com");
        // invalid EmailIDs
        email.add("abc");
        email.add("abc..");
        email.add("abc..@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@.com.my");
        email.add("abc123@gmail.a");
        email.add("abc123@.com");
        email.add("abc123@.com.com");
        email.add(".abc@abc.com");
        email.add("abc()*@gmail.com");
        email.add("abc..2002@gmail.com");
        email.add("abc.@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@gmail.com.1a");
        email.add("abc..@gmail.com");
        email.add("abc@gmail.com.aa.au");

        String reGex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
        // Creating/Defining a pattern to be searched
        Pattern pattern = Pattern.compile(reGex);

        for (String str : email) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("valid email: " + str + " :" + matcher.matches());
            } else {
                System.out.println("Invalid email: " + str + " :" + matcher.matches());
            }
        }
    }
}

