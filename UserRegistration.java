package com.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @description Class for defining the User Registration
 * @param
 *
 */
public class UserRegistration {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to User Registration");
        System.out.println("Enter the valid first name: ");
        String firstname = sc.nextLine();
        boolean result1 = Pattern.matches("[A-Z][a-z]{3,}", firstname);
        if(result1 == true){
            System.out.println("you have entered a valid first name");
        }else{
            System.out.println("Its not a valid first name...\n correct format is ( e.g 'John')");

        }
        System.out.println("Enter the valid last name: ");
        String lastname = sc.nextLine();
        boolean result2 = Pattern.matches("[A-Z][a-z]{3,}", lastname);
        if(result2 == true){
            System.out.println("you have entered a valid last name");
        }else{
            System.out.println("Its not a valid last name...\n correct format is ( e.g 'Mathew')");

        }

        System.out.println("Enter the valid email address: ");
        String email = sc.nextLine();
        boolean result3 = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
        if(result3 == true){
            System.out.println("you have entered a valid email address");
        }else{
            System.out.println("Its not a valid email...\n correct format is ( e.g 'xyz21@abc.com')");

        }
        
        System.out.println("Enter the valid phone number: ");
        String phone = sc.nextLine();
        boolean result4 = Pattern.compile("^[0-9]{1,3} [0-9]{10}$").matcher(phone).matches();
        if(result4 == true){
            System.out.println("you have entered a valid phone number");
        }else{
            System.out.println("Its not a valid phone number...\n correct format is ( e.g '91 1234567890')");

        }



    }
}
