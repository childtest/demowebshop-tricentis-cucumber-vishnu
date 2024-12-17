package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.DesktopsPage;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerTestSteps {
    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputersTab();
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String txt) {
        Assert.assertEquals(new ComputerPage().getComputerPageTitle(), txt);
    }

    //**********************************************************
    @And("I click on desktop link")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktops();
    }

    @Then("I should see the title as {string}")
    public void iShouldSeeTheTitleAs(String txt) {
        Assert.assertEquals(new DesktopsPage().getDesktopsPageTitle(), txt);
    }

    //******************************************************

    @And("I click on the product name {string}")
    public void iClickOnTheProductName(String productName) {
        new DesktopsPage().clickOnBuildYourOwnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new ProductDetailsPage().selectProcessorInDropDown(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String RAM) {
        new ProductDetailsPage().selectRamInDropDown(RAM);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String HDD) {
        new ProductDetailsPage().selectHDD(HDD);
    }

    @And("I select OS {string}")
    public void iSelectOS(String OS) {
        new ProductDetailsPage().selectOs(OS);
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String Software) {
        new ProductDetailsPage().selectSoftware(Software);
    }

    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new ProductDetailsPage().clickOnAddToCartButton();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String msg) {
        Assert.assertEquals(new ProductDetailsPage().getSuccessMessageToAddProductInCart(),
                msg);
    }
}
