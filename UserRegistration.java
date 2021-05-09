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
        boolean result = Pattern.matches("[A-Z][a-z]{3,}", firstname); //true
        if(result == true){
            System.out.println("you have entered a valid first name");
        }else{
            System.out.println("Its not a valid first name...\n correct format is ( e.g 'John')");

        }

    }
}
