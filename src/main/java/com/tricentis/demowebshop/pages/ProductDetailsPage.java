package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductDetailsPage.class.getName());

    @CacheLookup
    @FindBy(id = "product_attribute_16_5_4")
    WebElement processor;

    @CacheLookup
    @FindBy(id = "product_attribute_16_6_5")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='option-list']//li/input[@type='radio']/parent::li/label")
    List<WebElement> selectHDD;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='option-list']//li/input[@type='radio']/parent::li/label")
    List<WebElement> selectOs;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='option-list']//li/input[@type='checkbox']/parent::li/label")
    List<WebElement> selectSoftware;

    @CacheLookup
    @FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement successMessage;


    public void selectProcessorInDropDown(String name) {
        selectByVisibleTextFromDropDown(processor, name);
        log.info("Select processor '" + name + "'");
    }

    public void selectRamInDropDown(String name) {
        log.info("Select ram '" + ram + "'");
        selectByVisibleTextFromDropDown(ram, name);
    }

    public void selectHDD(String HDD) {
        for (WebElement hdd : selectHDD) {
            if (hdd.getText().equals(HDD)) {
                clickOnElement(hdd);
                log.info("Select HDD '" + HDD + "'");
                break;
            }
        }
    }

    public void selectOs(String osName) {
        for (WebElement os : selectOs) {
            if (os.getText().equals(osName)) {
                clickOnElement(os);
                log.info("Select HDD '" + osName + "'");
                break;
            }
        }
    }

    public void selectSoftware(String softwareName) {
        for (WebElement software : selectSoftware) {
            if (software.getText().equals(softwareName)) {
                clickOnElement(software);
                log.info("Select Software '" + softwareName + "'");
                break;
            }
        }
    }

    public void clickOnAddToCartButton() {
        log.info("Click on add to cart");
        clickOnElement(addToCart);
    }

    public String getSuccessMessageToAddProductInCart() {
        return getTextFromElement(successMessage);
    }

}
