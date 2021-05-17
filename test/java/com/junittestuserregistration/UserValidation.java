package com.junittestuserregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidation {

    @Test
    public void validate_The_User_For_FirstName_True_if_Correct() throws UserRegistrationException {
        UserValidate validate = new UserValidate();
        boolean result = validate.validateFirstname("Anuj");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void Validate_The_User_for_LastName_True_if_Correct() throws UserRegistrationException {
        UserValidate validate = new UserValidate();
        boolean result = validate.validateLastname("Mourya");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void Validate_The_User_For_Email_True_If_Correct() throws UserRegistrationException {
        UserValidate validate = new UserValidate();
        boolean result = validate.validateEmailAddress("anujmourya000@gmail.com");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void Validate_The_User_For_Mobile_True_If_Correct() throws UserRegistrationException {
        UserValidate validate = new UserValidate();
        boolean result = validate.validatePhone("91 8962331560");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void Validate_The_User_For_Password_True_If_Correct() throws UserRegistrationException {
        UserValidate validate = new UserValidate();
        boolean result = validate.validatePassword("Anujnm12@");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void check_For_Happy_Should_Pass_TestCase() throws UserRegistrationException {
        UserValidate validate = new UserValidate();
        String mood = validate.validateHappy("This is HAPPY message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void check_For_Sad_Should_Fails_TestCase() throws UserRegistrationException {
        UserValidate validate = new UserValidate();
        String mood = validate.validateHappy("This is SAD message");
        Assertions.assertEquals("SAD", mood);
    }
}
