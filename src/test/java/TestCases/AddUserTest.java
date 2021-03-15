package TestCases;

import components.Dashboard;
import components.LoginPage;
import components.Users;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.Login;
import steps.addUsers.addUsers;
import steps.addUsers.navigateAddUsers;
import steps.clickAdminConsole;

public class AddUserTest extends BaseClass {
    @Test
    public void testAddUser(){


        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(LoginPage.loginButton));

        clickAdminConsole clickAdminConsole = new clickAdminConsole(driver);
        clickAdminConsole.GoToAdminConsole();
        Login login = new Login(driver);
        login.LoginSteps();
        wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard.usersTab));

        navigateAddUsers navigateAddUsers = new navigateAddUsers(driver);
        navigateAddUsers.navigateToAddUserForm();


        wait.until(ExpectedConditions.presenceOfElementLocated(Users.addUserTitle));
        Assert.assertEquals(driver.findElement(Users.addUserTitle).getText(),"Add user","Title is not correct");
        addUsers addUsers = new addUsers(driver);
        addUsers.addUsersSteps();
        //Assert.assertEquals(driver.findElement(Users.successMessage).getText(),"Success! The user has been created.","Title is not correct");

    }
}
