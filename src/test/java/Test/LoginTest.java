package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {

    public WebDriver driver;

    public LoginTest(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;

    }
    @FindBy (xpath = "//a[@class='userbar__button __active']")
    WebElement loginBtn;
    @FindBy (xpath = "//input[@class='field j-focus'][@tabindex='1']")
    WebElement inputLgn;
    @FindBy (xpath = "//input[@type='password'][@class='field'][@tabindex='2']")
    WebElement inputPswrd;
    @FindBy (xpath = "//input[@class = 'btn-input'][@value ='Увійти']")
    WebElement btnLogin;

    public void clickLogin(){loginBtn.click();}
    public void inputLogin(){inputLgn.sendKeys("killativspidey@gmail.com");}
    public void inputPassword(){inputPswrd.sendKeys("Gimno3000");}
    public void clickBtnLogin(){btnLogin.click();}
}
