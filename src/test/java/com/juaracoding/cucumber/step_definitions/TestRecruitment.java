package com.juaracoding.cucumber.step_definitions;


import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.pages.DashboardPage;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.pages.RecruitmentPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRecruitment {
    public static WebDriver driver;
    private static ExtentTest extentTest;
    private RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu recruitment")
    public void user_click_menu_recruitment() {
        recruitmentPage.menuRecruitment();
        extentTest.log(LogStatus.PASS, "User click menu recruitment");
    }
    @Then("User on menu recruitment")
    public void user_on_menu_dashboard(){
        Assert.assertEquals(recruitmentPage.getTxtRecruitment(),"Recruitment");
        extentTest.log(LogStatus.PASS, "User on menu recruitment");
    }
    @When("User search hiring by manager")
    public void user_search_hiring_by_manager(){
        recruitmentPage.searchByHiringManager();
        recruitmentPage.btnSearchByHiringManager();
        extentTest.log(LogStatus.PASS,"User Searching hiring by manager");
    }
    @Then("User found hiring by manager")
    public void user_found_hiring_by_manager(){
        Assert.assertTrue(recruitmentPage.getTxtLinda().contains("Linda"));
        extentTest.log(LogStatus.PASS,"User found hiring by manager");
    }




    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
