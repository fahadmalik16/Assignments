package TestCases;

import TestData.ExcelDataProvider;
import components.Dashboard;
import components.LoginPage;
import components.Users;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import steps.Login;
import steps.addUsers.addUsers;
import steps.addUsers.navigateAddUsers;
import steps.addUsers.roleMapping;
import steps.addUsers.verifyUser;
import steps.clickAdminConsole;

public class testing extends BaseClass {

    @Test(dataProvider = "loginData",dataProviderClass = ExcelDataProvider.class)
    public void testAddUsers(String username1, String email1,String fname, String lname, String path){
        WebDriverWait wait = new WebDriverWait(driver,30);
        clickAdminConsole clickAdminConsole = new clickAdminConsole(driver);
        clickAdminConsole.GoToAdminConsole();
        Login login = new Login(driver);
        login.LoginSteps("super-admin","foobar");
        wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard.usersTab));
        verifyUser verifyUser = new verifyUser(driver);
        verifyUser.verifyUserStep();
        //boolean testUsername= verifyUser.verifyUserStep(username1);
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
