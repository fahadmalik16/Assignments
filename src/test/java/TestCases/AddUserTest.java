package TestCases;

import TestData.ExcelDataProvider;
import components.Dashboard;
import components.NewCreatedUser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.Login;
import steps.addUsers.*;
import steps.clickAdminConsole;

public class AddUserTest extends BaseClass {

    @Test(dataProvider = "loginData",dataProviderClass = ExcelDataProvider.class)
    public void testAddUser(String username1, String email1,String fname, String lname, String path){
        WebDriverWait wait = new WebDriverWait(driver,30);
        clickAdminConsole clickAdminConsole = new clickAdminConsole(driver);
        clickAdminConsole.GoToAdminConsole();
        Login login = new Login(driver);
        login.LoginSteps("super-admin","foobar");
        wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard.usersTab));
        navigateAddUsers navigateAddUsers = new navigateAddUsers(driver);
        navigateAddUsers.navigateToAddUserForm();

        //Assert.assertTrue(driver.findElement(Users.addUserTitle).isDisplayed(),"Title is not correct");
        addUsers addUsers = new addUsers(driver);
        addUsers.addUsersSteps(username1,email1,fname,lname);
        //Assert.assertEquals(driver.findElement(Users.successMessage).getText(),"Success! The user has been created.","Title is not correct");
        roleMapping roleMapping = new roleMapping(driver);
        roleMapping.roleMapStep(path);

        setPassword setPassword = new setPassword(driver);
        setPassword.settingPassword();

        loginVerify loginVerify = new loginVerify(driver);
        String abcd = loginVerify.loginVerifyStep(email1);
       // wait.until(ExpectedConditions.presenceOfElementLocated(NewCreatedUser.profileIcon));
        //wait.until(ExpectedConditions.presenceOfElementLocated(NewCreatedUser.profileIcon));

        Assert.assertTrue(driver.findElement(NewCreatedUser.profileIcon).isDisplayed());
        Assert.assertEquals(abcd,email1,"fail");
        // testUsername= verifyUser.verifyUserStep();
        //Assert.assertTrue(testUsername, "Use has not been added");

    }
    //@DataProvider(name = "loginDatass")

    //public Object[][] getDataFromDataprovider(){
       // return new Object[][]
            //    {
                //        { "admin", "foobar" },
              //          { "abcd", "UK" },
              //          { "Su-admin", "foobar" }
              //  };

   // }
}
