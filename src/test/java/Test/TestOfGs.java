package Test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class TestOfGs {
    public static WebDriver driver;
    public static LoginTest loginTest;
    public static ProfilePage profilePage;
    public static OrderPage orderPage;
    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        loginTest = new LoginTest(driver);
        profilePage = new ProfilePage(driver);
        orderPage = new OrderPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://gstore.ua/?gclid=Cj0KCQiAnuGNBhCPARIsACbnLzpIm0BunNyor6hcWxx9U2nLgtBOfdnQK-V0vDatFLojDQgOK4Pne48aAncaEALw_wcB");
    }
    @Test
    public void testLogin() {
        loginTest.clickLogin();
        loginTest.inputLogin();
        loginTest.inputPassword();
        loginTest.clickBtnLogin();
        profilePage.inputSearch();
        profilePage.clickSearch();
        orderPage.clickOrder();
        orderPage.getProductName();
        String name = orderPage.getProductName();
        Assert.assertEquals("Apple iPhone 8 Plus 64Gb Gold (MQ8N2)", name);
        orderPage.getNumber();
        String value = orderPage.getNumber();
        Assert.assertEquals("1", value);
    }
}
