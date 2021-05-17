package com.junittestuserregistration;

import java.util.regex.Pattern;

public class UserValidate {
    private static final String FIRST_NAME_PATTERN = "[A-Z][a-z]{3,}";
    private static final String LAST_NAME_PATTERN = "[A-Z][a-z]{3,}";
    private static final String EMAIL_ADDRESS = "^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$";
    private static final String PHONE = "^[0-9]{1,3} [0-9]{10}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-]?){8,}.*$";

    public boolean validateFirstname(String fname) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
            return pattern.matcher(fname).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter valid name");
        }
    }

    public boolean validateLastname(String lname) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
            return pattern.matcher(lname).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter valid last name");
        }
    }

    public boolean validateEmailAddress(String email) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(EMAIL_ADDRESS);
            return pattern.matcher(email).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter valid Email");
        }
    }

    public boolean validatePhone(String phone) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(PHONE);
            return pattern.matcher(phone).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter valid phone");
        }
    }

    public boolean validatePassword(String Password) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(PASSWORD);
            return pattern.matcher(Password).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter valid Password");
        }
    }

    public String validateHappy(String message) throws UserRegistrationException {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
