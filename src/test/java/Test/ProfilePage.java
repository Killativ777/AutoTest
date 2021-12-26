package Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ProfilePage {
    public WebDriver driver;


    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    WebElement nameProduct;
    WebElement searchBtn;

    public void inputSearch(){
        try {
            nameProduct = (new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='search__input']"))));
            nameProduct.sendKeys("iphone", Keys.ENTER);
        }
        catch (org.openqa.selenium.StaleElementReferenceException ex){
            nameProduct = (new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='search__input']"))));
            nameProduct.sendKeys("iphone", Keys.ENTER);
        }
    }
    public void clickSearch(){
        searchBtn = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='search__button']"))));
        searchBtn.click();
    }
}
