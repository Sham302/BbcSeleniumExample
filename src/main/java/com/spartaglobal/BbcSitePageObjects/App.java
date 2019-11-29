package com.spartaglobal.BbcSitePageObjects;

import com.spartaglobal.BbcSitePageObjects.BbcSite.BbcSite;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shmaila Rehman\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.navigate().to("https://www.bbc.co.uk/");
//        chromeDriver.findElementById("idcta-link").click();
//
//        chromeDriver.findElementById("username").click();
////        chromeDriver.sendKeys("srehman@spartglobal.com");

        ChromeDriver chromeDriver = new ChromeDriver();
//        BbcHomepage bbcHomepage = new BbcHomepage(chromeDriver);
//
//        bbcHomepage.goToBbcHomepage();
//        bbcHomepage.ClickSignInLink();
//        bbcHomepage.closeDriver();

        BbcSite bbcSite = new BbcSite(chromeDriver);

        bbcSite.bbcHomepage().goToBbcHomepage().ClickSignInLink();
    }
}
