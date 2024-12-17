package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement loginPageTitle;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@value = 'Log in']")
    WebElement btnLogin;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'validation-summary-errors']")
    WebElement errorMessage;

    public String getLoginPageTitle() {
        log.info("get login page title : " + loginPageTitle.toString());
        return getTextFromElement(loginPageTitle);
    }

    public void enterEmailId(String emailId) {
        sendTextToElement(email, emailId);
        log.info("Enter EmailId" + email);
    }

    public void enterPassword(String pass) {
        sendTextToElement(password, pass);
        log.info("Enter Password " + password);
    }

    public void clickOnLoginButton() {
        clickOnElement(btnLogin);
        log.info("Click on loginButton :" + btnLogin.toString());
    }

    public void enterEmailAndPasswordForLogin(String email, String pass){
        enterEmailId(email);
        enterPassword(pass);
        clickOnLoginButton();
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }


}
