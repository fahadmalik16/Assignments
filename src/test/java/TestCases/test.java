package TestCases;

import components.LoginPage;
import components.NewCreatedUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.addUsers.loginVerify;

public class test extends BaseClass {

    @Test
        public void abcd(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(LoginPage.emailField));
        driver.findElement(LoginPage.emailField).click();
        driver.findElement(LoginPage.emailField).clear();
        driver.findElement(LoginPage.emailField).sendKeys("ss@gmail.com");
        driver.findElement(LoginPage.passwordField).click();
        driver.findElement(LoginPage.passwordField).clear();
        driver.findElement(LoginPage.passwordField).sendKeys("Fahad1234!");
        driver.findElement(LoginPage.loginButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(NewCreatedUser.profileIcon));
        driver.findElement(NewCreatedUser.profileIcon).click();
        String theEmail = driver.findElement(NewCreatedUser.profileIcon).getText();
        System.out.println(theEmail);
        Assert.assertEquals(theEmail,"ss@gmail.com","YOU FAILED!");
        Assert.assertTrue(driver.findElement(NewCreatedUser.profileIcon).isDisplayed());
    }

}
