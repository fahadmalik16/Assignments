package TestCases;

import TestData.ExcelDataProvider;
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
import utils.waitBrowser;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseClass{
    @Test(dataProvider = "loginData",dataProviderClass = ExcelDataProvider.class)
    public void testSuccessfulLogin(String Email, String Password){

        clickAdminConsole clickAdminConsole = new clickAdminConsole(driver);
        clickAdminConsole.GoToAdminConsole();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(LoginPage.loginButton));

        Login login = new Login(driver);
        login.LoginSteps(Email,Password);
        System.out.println(Email+" "+Password);
        wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard.usersTab));
        // Asserting that the users tab text is equal to the expected one on the Dashboard screen after successful login
        Assert.assertEquals(driver.findElement(Dashboard.usersTab).getText(), "Users", "Tab text is not correct");

    }
}
