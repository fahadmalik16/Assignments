package steps.addUsers;

import components.Dashboard;
import components.LoginPage;
import components.Users;
import components.usersTable;
import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Login;
import steps.clickAdminConsole;

public class deleteUser {
    private WebDriver driver;

    public deleteUser(WebDriver driver) {
        this.driver = driver;
    }

    public void deleteUserStep(String email){
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
        driver.get(Constants.ipAddress);
        driver.manage().window().maximize();
        clickAdminConsole clickAdminConsole = new clickAdminConsole(driver);
        clickAdminConsole.GoToAdminConsole();
        Login login = new Login(driver);
        login.LoginSteps("super-admin","foobar");
        wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard.usersTab));
        driver.findElement(Dashboard.usersTab).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(Users.addUser));
        wait.until(ExpectedConditions.presenceOfElementLocated(usersTable.viewUsers));
        driver.findElement(usersTable.viewUsers).click();
        By deletebutton = By.xpath("//td[normalize-space()='"+email+"']//following-sibling::td[text()='Delete']");
        wait.until(ExpectedConditions.presenceOfElementLocated(deletebutton));
        driver.findElement(deletebutton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(usersTable.deleteConfirm));
        driver.findElement(usersTable.deleteConfirm).click();
        //System.out.println("anc"+email+"sad");
    }
}
