package steps;

import components.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    private WebDriver driver;
    public Login(WebDriver driver){
        this.driver = driver;
    }
    public void LoginSteps(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(LoginPage.loginButton));

        driver.findElement(LoginPage.emailField).click();
        driver.findElement(LoginPage.emailField).clear();
        driver.findElement(LoginPage.emailField).sendKeys("admin");
        driver.findElement(LoginPage.passwordField).click();
        driver.findElement(LoginPage.passwordField).clear();
        driver.findElement(LoginPage.passwordField).sendKeys("admin");
        driver.findElement(LoginPage.loginButton).click();

    }

}
