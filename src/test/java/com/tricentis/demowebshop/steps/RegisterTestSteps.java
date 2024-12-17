package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.RegisterPage;
import com.tricentis.demowebshop.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterTestSteps extends Utility {

    @When("I click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the {string} text")
    public void iShouldSeeTheText(String txt) {
        Assert.assertEquals(new RegisterPage().getPageTitle(), txt);
    }

    //*****************************************************************

    @When("I click on Register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I should see first name error message {string}")
    public void iShouldSeeFirstNameErrorMessage(String errorMsg) {
        Assert.assertEquals(new RegisterPage().getErrorMessageOfFirstNameIsRequired(),
                errorMsg);
    }

    @And("I should see last name error message {string}")
    public void iShouldSeeLastNameErrorMessage(String errorMsg) {
        Assert.assertEquals(new RegisterPage().getErrorMessageOfLastNameIsRequired(),
                errorMsg);
    }

    @And("I should see email error message {string}")
    public void iShouldSeeEmailErrorMessage(String errorMsg) {
        Assert.assertEquals(new RegisterPage().getErrorMessageOfEmailIsRequired(),
                errorMsg);
    }

    @And("I should see password error message {string}")
    public void iShouldSeePasswordErrorMessage(String errorMsg) {
        Assert.assertEquals(new RegisterPage().getErrorMessageOfPasswordIsRequired(),
                errorMsg);
    }

    @Then("I should see confirm password error message {string}")
    public void iShouldSeeConfirmPasswordErrorMessage(String errorMsg) {
        Assert.assertEquals(new RegisterPage().getErrorMessageOfConfirmPasswordIsRequired(),
                errorMsg);
    }

    //*****************************************************

    @When("I select gender Female")
    public void iSelectGenderFemale() {
        new RegisterPage().selectGenderOfFemale();
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String fName) {
        new RegisterPage().enterFirstName(fName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lName) {
        new RegisterPage().enterLastName(lName);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmailAddress("primetest"+generateRandomNumber()+"@gmail.com");
    }

    @And("I enter password {string}")
    public void iEnterPassword(String pass) {
        new RegisterPage().enterPassword(pass);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String cPass) {
        new RegisterPage().enterConfirmPassword(cPass);
    }

    @Then("I should see register message {string}")
    public void iShouldSeeRegisterMessage(String msg) {
        Assert.assertEquals(new RegisterPage().getRegisterSuccessMessage(),
                msg);
    }
}
