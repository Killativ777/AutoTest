package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrderPage {

    public WebDriver driver;

    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"j-buy-button-widget-421\"]")
    WebElement orderBtn;
    @FindBy(xpath = "//div[@class='cart-title']")
    WebElement productName;
    @FindBy(xpath = "//input[@class='counter-field j-quantity-p']")
    WebElement productValue;

    public void clickOrder() {
        orderBtn.click();
    }
    public String getProductName(){
        return productName.getText();
    }
    public String getNumber(){
        return productValue.getAttribute("Value");
    }
}
