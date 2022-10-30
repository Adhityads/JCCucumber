package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.LoginDemoqaPage;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLoginDemoqa {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginDemoqaPage loginDemoqaPage = new LoginDemoqaPage();

    public TestLoginDemoqa() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User go to web login demoqa")
    public void user_go_to_web_login_demoqa(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User Go to web login demoqa");
    }
    @And("User enter username and password")
    public void user_enter_username_and_password(){
        loginDemoqaPage.login("dhittydua","dhittyjuaracoding");
        extentTest.log(LogStatus.PASS,"User enter username and password");
    }
    @And("User click button login demoqa")
    public void user_click_button_login(){
        loginDemoqaPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS,"User click button login");
    }
    @Then("User login success")
    public void user_login_success(){
        Assert.assertTrue(loginDemoqaPage.getTxtLoginSuccess().contains("Hello"));
        extentTest.log(LogStatus.PASS,"User login Success");
    }

}
