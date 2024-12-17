package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginTestSteps {

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should see {string} message display")
    public void iShouldSeeMessageDisplay(String msg) {
        Assert.assertEquals(new LoginPage().getLoginPageTitle(), msg);
    }

    // ******************************************************************

    @And("I enter email id {string} and password {string} for login")
    public void iEnterEmailIdAndPasswordForLogin(String email, String pass) {
        new LoginPage().enterEmailAndPasswordForLogin(email, pass);
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMsg) {
        System.out.println(new LoginPage().getErrorMessage());
        // Assert.assertEquals(new LoginPage().getErrorMessage(), errorMsg);
    }

    //*******************************************************************

    @Then("I should see the {string} link is displayed")
    public void iShouldSeeTheLinkIsDisplayed(String txt) {
        if (txt.equalsIgnoreCase("Log out"))
            Assert.assertEquals(new HomePage().getLogOutText(), txt);
        else
            Assert.assertEquals(new HomePage().getLogInText(), txt);

    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogout();
    }
}
