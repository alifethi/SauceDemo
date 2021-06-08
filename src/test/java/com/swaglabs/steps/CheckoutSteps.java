package com.swaglabs.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.swaglabs.utilities.CommonMethods;
import com.swaglabs.utilities.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps extends CommonMethods {

    @Given("user is actually successfully logged in")
    public void user_is_actually_successfully_logged_in() throws InterruptedException {
        sendText(loginPage.userName, ConfigsReader.getProperty("username"));
        sendText(loginPage.password, ConfigsReader.getProperty("password"));
        click(loginPage.loginBtn);
        Thread.sleep(1000);
    }

    @When("I click on item with name {string}")
    public void i_click_on_item_with_name(String itemName) {
        for (WebElement item : mainPage.itemList) {
            if (item.getText().equals(itemName)) {
                click(item);
                break;
            }
        }

    }

    @When("I click on the ADD TO CART button")
    public void i_click_on_the_add_to_cart_button() throws InterruptedException {
        Thread.sleep(1000);
        click(inventoryItemPage.addBtn);
        Thread.sleep(1000);
    }

    @When("I click on the shopping cart button")
    public void i_click_on_the_shopping_cart_button() {
        click(inventoryItemPage.shoppingCard);
    }

    @When("I click on the checkout button")
    public void i_click_on_the_checkout_button() throws InterruptedException {
        Thread.sleep(1000);
        click(cart.checkoutBtn);
        Thread.sleep(1000);
    }

    @When("I enter the order information as {string}, {string}, and {string}")
    public void i_enter_the_order_information_as_and(String firstName, String lastName, String zipCode) {

        sendText(checkoutStepOne.fname, firstName);
        sendText(checkoutStepOne.lname, lastName);
        sendText(checkoutStepOne.zipCode, zipCode);
    }

    @When("I click on continue button")
    public void i_click_on_continue_button() throws InterruptedException {
        Thread.sleep(1000);
        click(checkoutStepOne.continueBtn);
        Thread.sleep(1000);
    }

    @Then("I verify the item name matches that of {string}")
    public void i_verify_the_item_name_matches_that_of(String itemName) {
        Assert.assertEquals(itemName, checkoutStepTwo.itemName.getText());
    }

    @Then("I click on finish button")
    public void i_click_on_finish_button() {
        click(checkoutStepTwo.finishBtn);
    }

    @Then("I validate that the {string} message is displayed")
    public void i_validate_that_the_message_is_displayed(String expectedMsg) {
        String actualMsg = checkoutComplete.completeMsg.getText();
        Assert.assertEquals("The complete message is different", expectedMsg, actualMsg);
    }


}