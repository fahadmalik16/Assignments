package TestCases;

import components.Dashboard;
import components.keyCloakPage;
import constants.Constants;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import steps.Login;
import steps.addUsers.navigateAddUsers;
import steps.clickAdminConsole;


public class BaseClass {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        //Launching browser
        driver.get(Constants.ipAddress);
        driver.manage().window().maximize();

    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
