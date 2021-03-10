package TestCases;

import components.Dashboard;
import components.LoginPage;
import components.Users;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.Login;
import steps.clickAdminConsole;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseClass{
    @Test
    public void testSuccessfulLogin(){

        clickAdminConsole clickAdminConsole = new clickAdminConsole(driver);
        clickAdminConsole.GoToAdminConsole();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(LoginPage.loginButton));
        Assert.assertEquals(driver.findElement(LoginPage.loginTitle).getText(), "Login", "Login text is not correct");
        Login login = new Login(driver);
        login.LoginAction();
        wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard.usersTab));
        Assert.assertEquals(driver.findElement(Dashboard.usersTab).getText(), "Users", "Tab text is not correct");
    }
}
