package steps.addUsers;

import components.LoginPage;
import components.NewCreatedUser;
import components.Users;
import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginVerify {
    private WebDriver driver;

    public loginVerify(WebDriver driver) {
        this.driver = driver;
    }

    public String loginVerifyStep(String email) {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
        driver.get(Constants.ipAddress1);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(LoginPage.emailField));
        driver.findElement(LoginPage.emailField).click();
        driver.findElement(LoginPage.emailField).clear();
        driver.findElement(LoginPage.emailField).sendKeys(email);
        driver.findElement(LoginPage.passwordField).click();
        driver.findElement(LoginPage.passwordField).clear();
        driver.findElement(LoginPage.passwordField).sendKeys("Fahad1234!");
        driver.findElement(LoginPage.loginButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(NewCreatedUser.profileIcon));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(NewCreatedUser.profileIcon),email));
        wait.until(ExpectedConditions.presenceOfElementLocated(NewCreatedUser.profileIcon));

        driver.findElement(NewCreatedUser.profileIcon).click();
         String abcd = driver.findElement(NewCreatedUser.profileIcon).getText();
        driver.findElement(NewCreatedUser.Logout1).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(LoginPage.emailField));
        return abcd;
    }
}

