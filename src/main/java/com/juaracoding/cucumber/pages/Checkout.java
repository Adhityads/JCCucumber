package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
    private WebDriver driver;

    public Checkout() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
    WebElement btnMenu;
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement btnCheckout;
    @FindBy(xpath = "//*[@id=\"billing_first_name\"]")
    WebElement firstname;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement lastname;
    @FindBy(xpath = "//span[@aria-label='Country / Region']//span[@role='presentation']")
    WebElement country;
    @FindBy(xpath = "//input[@role='combobox']")
    WebElement txtComboBox;
    @FindBy(xpath = "//*[@id=\"billing_address_1\"]")
    WebElement address;
    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement city;
    @FindBy(xpath = "//span[@id='select2-billing_state-container']")
    WebElement province;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement postcode;
    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement phone;
    @FindBy(xpath = "//span[@class='woocommerce-terms-and-conditions-checkbox-text']")
    WebElement btnRadio;
    @FindBy(xpath = "//button[@id='place_order']")
    WebElement btnPlaceorder;
    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/div/p[1]")
    WebElement txtChecoutSuccess;

    public void menu(){
        btnMenu.click();
    }
    public void checkout(){
        btnCheckout.click();
    }
    public void name(){
        firstname.sendKeys("dhitty");
        lastname.sendKeys("dua");
    }
    public void location(){
        country.click();
        txtComboBox.sendKeys("Indonesia", Keys.ENTER);
        address.sendKeys("Tambun Utara");
        city.sendKeys("Bekasi");
        province.click();
        txtComboBox.sendKeys("Jawa Barat",Keys.ENTER);
        postcode.sendKeys("17510");
        phone.sendKeys("081122334455");
    }
    public void checkBox(){
        btnRadio.click();
    }
    public void placeorder(){
        btnPlaceorder.click();
    }
    public String getTxtCheckoutSuccess(){
        return txtChecoutSuccess.getText();
    }
}
