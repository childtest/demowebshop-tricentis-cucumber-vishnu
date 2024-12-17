package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement buildYourOwnComputer;

    public String getDesktopsPageTitle() {
        log.info("get desktops page title");
        return getTextFromElement(pageTitle);
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
        log.info("click on : " + buildYourOwnComputer.toString());
    }
}
