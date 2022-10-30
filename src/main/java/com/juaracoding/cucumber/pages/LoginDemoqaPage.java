package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemoqaPage {
    private WebDriver driver;

    public LoginDemoqaPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;
    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/div/a/img")
    WebElement btnMenu;
    @FindBy(xpath = "//*[@id=\"noo-site\"]/section/div/div/h1")
    WebElement txtLogin;
    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[1]")
    WebElement txtLoginSuccess;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }
    public void clickBtnLogin() {
        btnLogin.click();
    }
    public void clikcBtnMenu(){
        btnMenu.click();
    }
    public String getTxtLogin(){
        return txtLogin.getText();
    }
    public String getTxtLoginSuccess(){
        return txtLoginSuccess.getText();
    }
}
