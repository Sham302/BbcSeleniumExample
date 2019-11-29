package com.spartaglobal.BbcSitePageObjects;

import com.spartaglobal.BbcSitePageObjects.BbcSite.BbcSite;
import com.spartaglobal.seleniumconfig.SeleniumConfig;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcSignInTests {

    private static ChromeDriver driver;
    private static BbcSite bbcSite;

    private String shortPasswordErrorMessage = "Sorry, that password is too short. It needs to be eight characters or more.";
    private String characterOtherThanlettersError = "Sorry, that password isn't valid. Please include something that isn't a letter.";
    private String invalidUsernameError = "Sorry, we can’t find an account with that username. If you're over 13, try your email address instead or get help here.";
    private String accountDoesntExist = "Sorry, we can’t find an account with that email. You can register for a new account or get help here.";
    private String passwordMustBeHardToGuess = "";


    @BeforeClass
    public static void setup() {

         SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome","C:\\Users\\Shmaila Rehman\\Downloads\\chromedriver_win32\\chromedriver.exe");
         chromeDriverConfig.setScreenSize(1792,827);
         bbcSite = new BbcSite(chromeDriverConfig.getDriver());
    }

    @AfterClass
    public static void teardown(){
        bbcSite.bbcHomepage().closeDriver();
    }

    @Test
    public void passwordTooShort(){
        Assert.assertEquals(shortPasswordErrorMessage,bbcSite.bbcSignInPage().goToSignInPage().inputPassword("dsf56").sendTabKey().getPasswordErrorMessageText());

    }

    @Test
    public void passwordContainsNoNumbers(){

        Assert.assertEquals(characterOtherThanlettersError,bbcSite.bbcSignInPage().goToSignInPage().inputPassword("dsfkjkkhsd").sendTabKey().getPasswordErrorMessageText());
    }


}
