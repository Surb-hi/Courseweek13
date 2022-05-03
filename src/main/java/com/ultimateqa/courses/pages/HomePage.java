package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By signInLink = By.linkText("Sign In");
    By welcomeText=By.xpath("//h1[contains(text(),'Welcome Back!')]");
    public void clickOnSignInLink() {
        clickOnElement(signInLink);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

}
