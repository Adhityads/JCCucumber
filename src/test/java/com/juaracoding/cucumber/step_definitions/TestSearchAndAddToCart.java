package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.pages.SearchAndAddToCart;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSearchAndAddToCart {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private SearchAndAddToCart searchAndAddToCart = new SearchAndAddToCart();

    public TestSearchAndAddToCart() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User Search item satu")
    public void user_search_item_satu(){
        searchAndAddToCart.search("shirt");
        extentTest.log(LogStatus.PASS,"User search item satu");
    }
    @Then("User has search item satu")
    public void user_has_search_item_satu(){
        searchAndAddToCart.getTxtSearchResultSatu();
        Assert.assertEquals(searchAndAddToCart.getTxtSearchResultSatu(),"Showing all 7 results");
        extentTest.log(LogStatus.PASS,"user has search item satu");
    }
    @When("User pilih item satu")
    public void user_pilih_item_satu(){
        Hooks.scroll(400);
        searchAndAddToCart.setPilihItemSatu();
        extentTest.log(LogStatus.PASS,"User pilih item satu");
    }
    @And("User pilih item satu color")
    public void user_pilih_item_satu_color(){
        Hooks.scroll(300);
        searchAndAddToCart.setPilihColor();
        extentTest.log(LogStatus.PASS,"User pilih item satu color");
    }
    @And("User pilih item satu size")
    public void user_pilih_item_satu_size(){
        searchAndAddToCart.setPilihSize();
        extentTest.log(LogStatus.PASS,"User pilih item satu size");
    }
    @And("User add to cart item satu")
    public void user_add_to_cart_item_satu(){
        searchAndAddToCart.setAddToCartItemSatu();
        extentTest.log(LogStatus.PASS,"User add to cart item satu");
    }
    @Then("User has add to cart item satu")
    public void user_has_add_to_cart_item_satu(){
        Assert.assertTrue(searchAndAddToCart.getTxtItemSatuSuccess().contains("has been added to your cart"));
        extentTest.log(LogStatus.PASS,"User has add to cart item satu");
    }

    @When("User Search item dua")
    public void user_search_item_dua(){
        searchAndAddToCart.search("dress");
        extentTest.log(LogStatus.PASS,"User search item dua");
    }
    @Then("User has search item dua")
    public void user_has_search_item_dua(){
        searchAndAddToCart.getTxtSearchResultDua();
        Assert.assertEquals(searchAndAddToCart.getTxtSearchResultSatu(),"Showing all 16 results");
        extentTest.log(LogStatus.PASS,"User has search item dua");
    }
    @When("User pilih item dua")
    public void user_pilih_item_dua(){
        Hooks.scroll(400);
        searchAndAddToCart.setPilihItemDua();
        extentTest.log(LogStatus.PASS,"User pilih item dua");
    }
    @And("User pilih item dua color")
    public void user_pilih_item_dua_color(){
        Hooks.scroll(300);
        searchAndAddToCart.setPilihColor();
        extentTest.log(LogStatus.PASS,"User pilih item dua color");
    }
    @And("User pilih item dua size")
    public void user_pilih_item_dua_size(){
        searchAndAddToCart.setPilihSize();
        extentTest.log(LogStatus.PASS,"User pilih item dua size");
    }
    @And("User add to cart item dua")
    public void user_add_to_cart_dua_satu(){
        searchAndAddToCart.setAddToCartItemDua();
        extentTest.log(LogStatus.PASS,"User add to cart item dua");
    }
    @Then("User has add to cart item dua")
    public void user_has_add_to_cart_item_dua(){
        Assert.assertTrue(searchAndAddToCart.getTxtItemSatuSuccess().contains("has been added to your cart"));
        extentTest.log(LogStatus.PASS,"User has add to cart item dua");
    }
}
