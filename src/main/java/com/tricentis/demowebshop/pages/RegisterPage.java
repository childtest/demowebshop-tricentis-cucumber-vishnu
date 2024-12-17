package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement registerPageTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement btnRegister;

    @CacheLookup
    @FindBy(xpath = "//span[@for='FirstName']")
    WebElement firstNameIsRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@for='LastName']")
    WebElement lastNameIsRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@for='Email']")
    WebElement emailIsRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@for='Password']")
    WebElement passwordIsRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    WebElement confirmPasswordRequired;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmailId;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement enterConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement successfullyRegisterMessage;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement btnContinue;

    public String getPageTitle() {
        log.info("get register page title : " + registerPageTitle.toString());
        return getTextFromElement(registerPageTitle);
    }

    public String getErrorMessageOfFirstNameIsRequired() {
        log.info("Firstname is required : " + firstNameIsRequired.toString());
        return getTextFromElement(firstNameIsRequired);
    }

    public String getErrorMessageOfLastNameIsRequired() {
        log.info("Last name is required : " + lastNameIsRequired.toString());
        return getTextFromElement(lastNameIsRequired);
    }

    public String getErrorMessageOfEmailIsRequired() {
        log.info("Email is required : " + emailIsRequired.toString());
        return getTextFromElement(emailIsRequired);
    }

    public String getErrorMessageOfPasswordIsRequired() {
        log.info("Password is required : " + passwordIsRequired.toString());
        return getTextFromElement(passwordIsRequired);
    }

    public String getErrorMessageOfConfirmPasswordIsRequired() {
        log.info("Confirm Password is required : " + confirmPasswordRequired.toString());
        return getTextFromElement(confirmPasswordRequired);
    }

    public void selectGenderOfFemale() {
        log.info("Click on gender of Female");
        clickOnElement(genderFemale);
    }

    public void enterFirstName(String fName) {
        log.info("Enter first name : " + fName);
        sendTextToElement(enterFirstName, fName);
    }

    public void enterLastName(String lName) {
        log.info("Enter last name : " + lName);
        sendTextToElement(enterLastName, lName);
    }

    public void enterEmailAddress(String email) {
        log.info("Enter email : " + email);
        sendTextToElement(enterEmailId, email);
    }

    public void enterPassword(String pass) {
        log.info("Enter password : " + pass);
        sendTextToElement(enterPassword, pass);
    }

    public void enterConfirmPassword(String confirmPass) {
        log.info("Enter confirm password : " + confirmPass);
        sendTextToElement(enterConfirmPassword, confirmPass);
    }

    public void clickOnRegisterButton() {
        clickOnElement(btnRegister);
        log.info("Click on register button : " + btnRegister.toString());
    }

    public String getRegisterSuccessMessage() {
        log.info("get register Success message : ");
        return getTextFromElement(successfullyRegisterMessage);
    }

    public void clickOnContinueButton() {
        log.info("Click on continue button : " + btnContinue.toString());
        clickOnElement(btnContinue);
    }
}
