package steps;

import components.LoginPage;
import components.keyCloakPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class clickAdminConsole {

    private WebDriver driver;
    public clickAdminConsole(WebDriver driver){
        this.driver = driver;
    }
    public void GoToAdminConsole(){

        driver.findElement(keyCloakPage.adminConsole).click();
        // var loginText = driver.findElement(LoginPage.loginButton).getText();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

}

