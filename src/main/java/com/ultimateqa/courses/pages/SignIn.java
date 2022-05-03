package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignIn extends Utility {

    //By signInLink = By.linkText("Sign In");
    By userNameLink = By.name("user[email]");
    By passWordLink = By.id("user[password]");
    By signinButtonlink = By.xpath("//div/input[@value='Sign in']");
    By invalidErrorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public void userShouldEnterInvalidUserName(String usernametext) {

        sendTextToElement(userNameLink, usernametext);
    }

    public void userShouldEnterInvalidPassword(String passordtext) {
        sendTextToElement(passWordLink, passordtext);
    }

    public void ClickOnSignInButton() {
        clickOnElement(signinButtonlink);
    }

    public String errorMsgText() {
        return getTextFromElement(invalidErrorMessage);
    }
}
