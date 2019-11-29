package com.spartaglobal.BbcSitePageObjects.BbcSite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BbcSignInPage {

    private WebDriver driver;
    private String bbcSignInPageURL = "https://account.bbc.com/signin";
    private By userNameField = By.id("user-identifier-input");
    private By passwordField = By.id("password-input");
    private By submitButton = By.id("submit-button");
    private By usernameErrorId = By.id("form-message-username");
    private By passwordErrorId = By.id("form-message-password");

    public BbcSignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public BbcSignInPage goToSignInPage(){
        driver.navigate().to(bbcSignInPageURL);
        return this;
    }

    public BbcSignInPage inputUsername(String username){
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public BbcSignInPage inputPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public BbcSignInPage clickSubmitButton(){
        driver.findElement(submitButton).click();
        return this;
    }

    public String getUsernameErrorMessageText(){

        return driver.findElement(usernameErrorId).getText();
    }

    public String getPasswordErrorMessageText(){
        return driver.findElement(passwordErrorId).getText();
    }

    public BbcSignInPage sendTabKey(){
        driver.findElement(passwordField).sendKeys(Keys.TAB);
        return this;
    }
}
