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
    WebElement orderBtn;
    String productName;
    String productValue;

    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickOrder() {
        orderBtn = driver.findElement(By.xpath("//*[@id=\"j-buy-button-widget-421\"]"));
        orderBtn.click();
    }
    public String getProductName(){
        productName = driver.findElement(By.xpath("//div[@class='cart-title']")).getText();
        return productName;
    }
    public String getNumber(){
        productValue = driver.findElement(By.xpath("//input[@class='counter-field j-quantity-p']")).getAttribute("Value");
        return productValue;
    }
}
