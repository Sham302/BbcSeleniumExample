package com.spartaglobal.BbcSitePageObjects.BbcSite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcHomepage {
    private WebDriver driver;

    private String homePageURL = "https://www.bbc.co.uk/";
    private By singInLinkID = By.id("idcta-link");

    public BbcHomepage(WebDriver driver){
        this.driver = driver;
    }

    public BbcHomepage goToBbcHomepage(){
        driver.navigate().to(homePageURL);
        return this; //returning the object
    }

    public BbcHomepage ClickSignInLink(){
        driver.findElement(singInLinkID).click();
        return this;
    }

    public BbcHomepage closeDriver(){
        driver.close();
        return this;
    }
}
