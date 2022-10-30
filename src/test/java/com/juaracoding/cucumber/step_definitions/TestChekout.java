package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.Checkout;
import com.juaracoding.cucumber.pages.SearchAndAddToCart;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestChekout {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Checkout checkout = new Checkout();

    public TestChekout() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User go to menu")
    public void user_go_to_menu(){
        Hooks.scroll(200);
        checkout.menu();
        extentTest.log(LogStatus.PASS,"User go to menu");
    }
    @And("User go to checkout menu")
    public void user_go_to_checkout_menu(){
        checkout.checkout();
        extentTest.log(LogStatus.PASS,"User go to checkout menu");
    }
    @And("User fill form name")
    public void user_fill_form_name(){
        Hooks.scroll(500);
        checkout.name();
        extentTest.log(LogStatus.PASS,"User fill form name");
    }
    @And("User fill form location")
    public void user_fill_location_form(){
        Hooks.scroll(300);
        checkout.location();
        extentTest.log(LogStatus.PASS,"User fill form location");
    }
    @And("User check button terms")
    public void user_check_button_terms(){
        checkout.checkBox();
        extentTest.log(LogStatus.PASS,"User click button terms");
    }
    @And("User click placeorder")
    public void user_click__button_placeorder(){
        checkout.placeorder();
        extentTest.log(LogStatus.PASS,"User click button place order");
    }
    @Then("User checkout success")
    public void user_checkout_success(){
        checkout.getTxtCheckoutSuccess();
        Assert.assertEquals(checkout.getTxtCheckoutSuccess(),"Thank you. Your order has been received.");
        extentTest.log(LogStatus.PASS,"User checkout Success");
    }
}
