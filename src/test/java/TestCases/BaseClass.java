package TestCases;

import components.keyCloakPage;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        //Launching browser
        driver.get(Constants.ipAddress);
        driver.manage().window().maximize();

    }
    //@AfterClass
    //public void tearDown(){
     //   driver.quit();
    //}

}
