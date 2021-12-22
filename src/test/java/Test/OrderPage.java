package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    public WebDriver driver;

    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickOrder() {
        WebElement orderBtn = driver.findElement(By.xpath("//*[@id=\"j-buy-button-widget-421\"]"));
        orderBtn.click();
    }
    public String getProductName(){
        String productName = driver.findElement(By.xpath("//*[@id=\"product_d2ae9b849ca51f72ff346193c93afd04\"]/td[2]/div[1]/a")).getText();
        return productName;
    }
    public String getNumber(){
        String productValue = driver.findElement(By.xpath("//*[@id=\"product_d2ae9b849ca51f72ff346193c93afd04\"]/td[3]/div/div/div[1]/div/input")).getAttribute("Value");
        return productValue;
    }
}
