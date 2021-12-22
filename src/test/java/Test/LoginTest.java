package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
    public WebDriver driver;
    public LoginTest(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    public void clickLogin(){
        WebElement loginBtn = driver.findElement(By.xpath("//a[@class='userbar__button __active']"));
        loginBtn.click();
    }
    public void inputLogin(){
        WebElement enterLogin = driver.findElement(By.xpath("//*[@id=\"login_form_id\"]/dl/dd[1]/input"));
        enterLogin.sendKeys("killativspidey@gmail.com");
    }
    public void inputPassword(){
        WebElement enterPassword = driver.findElement(By.xpath("//*[@id=\"login_form_id\"]/dl/dd[2]/input"));
        enterPassword.sendKeys("Gimno3000");
    }
    public void clickBtnLogin(){
            WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"login_form_id\"]/dl/dd[3]/span[1]/input"));
            btnLogin.click();
    }
}
