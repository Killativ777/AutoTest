package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProfilePage {

    public WebDriver driver;

    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@class='search__input']")
    WebElement nameProduct;
    @FindBy(xpath = "//button[@class='search__button']")
    WebElement searchBtn;

    public void inputSearch(){
        try {
            new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(nameProduct));
            nameProduct.sendKeys("iphone", Keys.ENTER);
        }
        catch (org.openqa.selenium.StaleElementReferenceException ex){
            new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(nameProduct));
            nameProduct.sendKeys("iphone", Keys.ENTER);
        }
    }
    public void clickSearch(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(searchBtn));
        searchBtn.click();
    }
}
