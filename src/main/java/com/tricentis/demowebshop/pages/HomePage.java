package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement login;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement register;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logout;

    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement clickOnComputers;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement verifyLoginLink;

    public void clickOnLoginLink() {
        clickOnElement(login);
        log.info("Click on Login Link : " + login.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(register);
        log.info("Click On RegisterLink : " + register.toString());
    }

    public void clickOnLogout() {
        clickOnElement(logout);
        log.info("Click on logoutLink : " + logout.toString());
    }

    public String getLogInText(){
        log.info("get log in link text : " + verifyLoginLink.toString());
        return getTextFromElement(verifyLoginLink);
    }

    public String getLogOutText(){
        log.info("get log out link text : " + logout.toString());
        return getTextFromElement(logout);
    }

    public void clickOnComputersTab() {
        clickOnElement(clickOnComputers);
        log.info("Click on computer tab" + clickOnComputers.toString());
    }
}
