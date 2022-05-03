package com.ultimateqa.courses.Testsuits;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignIn;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {
    HomePage signIn = new HomePage();
    SignIn sign=new SignIn();
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        signIn.clickOnSignInLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = signIn.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void verifyTheErrorMessage(){
        signIn.clickOnSignInLink();
        sign.userShouldEnterInvalidUserName("surbhi");
        sign.userShouldEnterInvalidPassword("Prime123");
        sign.ClickOnSignInButton();
        String expectedMessage = "Invalid email or password.";
        String actualMessage = sign.errorMsgText();
        Assert.assertEquals(expectedMessage, actualMessage, "");
    }
}
