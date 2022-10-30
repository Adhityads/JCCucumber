package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchAndAddToCart {
    private WebDriver driver;

    public SearchAndAddToCart() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a")
    WebElement btnSearch;
    @FindBy(xpath = "//input[@name='s']")
    WebElement txtSearchSatu;
    @FindBy(xpath = "//p[@class='woocommerce-result-count']")
    WebElement txtSearchResult;
    @FindBy(xpath = "//a[normalize-space()='pink drop shoulder oversized t shirt']")
    WebElement pilihItemSatu;
    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    WebElement pilihColor;
    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    WebElement pilihSize;
    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement addToCartItemSatu;
    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div")
    WebElement txtItemSatuSuccess;
    @FindBy(xpath = "//a[normalize-space()='white milkmaid hook and eye bodycon midi dress']")
    WebElement pilihItemDua;
    @FindBy(xpath = "//*[@id=\"product-1473\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement addTocartItemDua;

    public void search(String namaitem){
        btnSearch.click();
        txtSearchSatu.sendKeys(namaitem, Keys.ENTER);
    }
    public String getTxtSearchResultSatu(){
        return txtSearchResult.getText();
    }
    public void setPilihItemSatu(){
        pilihItemSatu.click();
    }
    public void setPilihColor(){
        WebElement elementSelectColor = pilihColor;
        Select color = new Select(elementSelectColor);
        color.selectByIndex(1);
    }
    public void setPilihSize(){
        WebElement elementSelectSize = pilihSize;
        Select size = new Select(elementSelectSize);
        size.selectByIndex(1);
    }
    public void setAddToCartItemSatu(){
        addToCartItemSatu.click();
    }
    public String getTxtItemSatuSuccess(){
        return txtItemSatuSuccess.getText();
    }
    public String getTxtSearchResultDua(){
        return txtSearchResult.getText();
    }
    public void setPilihItemDua(){
        pilihItemDua.click();
    }
    public void setAddToCartItemDua(){
        addTocartItemDua.click();
    }
}

