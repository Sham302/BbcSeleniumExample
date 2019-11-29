package com.spartaglobal.BbcSitePageObjects.BbcSite;

import com.spartaglobal.BbcSitePageObjects.BbcSite.pages.BbcHomepage;
import com.spartaglobal.BbcSitePageObjects.BbcSite.pages.BbcSignInPage;
import org.openqa.selenium.WebDriver;

public class BbcSite {
    private WebDriver driver;
    private BbcHomepage bbcHomepage;
    private BbcSignInPage bbcSignInPage;

    public BbcSite(WebDriver driver) {
        this.driver = driver;
//        driver.manage().window().setSize(new Dimension(400,400));
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        this.bbcHomepage = new BbcHomepage(driver);
        this.bbcSignInPage = new BbcSignInPage(driver);
    }

    public BbcHomepage bbcHomepage(){
        return bbcHomepage;
    }

    public BbcSignInPage bbcSignInPage(){
        return bbcSignInPage;
    }

}
