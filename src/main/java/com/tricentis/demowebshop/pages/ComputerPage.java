package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktops;

    public String getComputerPageTitle() {
        log.info("get computer page title");
        return getTextFromElement(pageTitle);
    }

    public void clickOnDesktops() {
        clickOnElement(desktops);
        log.info("click on desktops : " + desktops.toString());
    }
}
