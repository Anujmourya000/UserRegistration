package com.junittestuserregistration;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class JunitParameterisedTest {
    private String email;
    private boolean expectedResult;
    private UserValidate email_id;


    public JunitParameterisedTest(String email, boolean expectedResult) {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize(){
        email_id = new UserValidate();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true}});
    }

    @Test
    public void test_User_Registration_Test_For_Multiple_Emails(){
        System.out.println("All emails formats : "  + expectedResult);
        Assertions.assertEquals(expectedResult, email_id.validateEmailAddress(email));
    }
}
