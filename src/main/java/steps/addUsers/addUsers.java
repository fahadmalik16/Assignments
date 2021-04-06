package steps.addUsers;

import components.Dashboard;
import components.LoginPage;
import components.Users;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addUsers {
    private WebDriver driver;
    public addUsers(WebDriver driver){
        this.driver = driver;
    }

    public void addUsersSteps(String username1, String email1,String fname, String lname){
        WebDriverWait wait = new WebDriverWait(driver,30);
        driver.findElement(Users.usernameField).click();
        driver.findElement(Users.usernameField).clear();
        driver.findElement(Users.usernameField).sendKeys(username1);
        driver.findElement(Users.emailField).click();
        driver.findElement(Users.emailField).clear();
        driver.findElement(Users.emailField).sendKeys(email1);
        driver.findElement(Users.firstNameField).click();
        driver.findElement(Users.firstNameField).clear();
        driver.findElement(Users.firstNameField).sendKeys(fname);
        driver.findElement(Users.lastNameField).click();
        driver.findElement(Users.lastNameField).clear();
        driver.findElement(Users.lastNameField).sendKeys(lname);
        //driver.findElement(Users.actionsDropdown).click();
        //driver.findElement(Users.dropdownOption).click();
        //elect dropdownElement = new Select(driver.findElement(Users.actionsDropdown));
        //dropdownElement.selectByValue("CONFIGURE_TOTP");
        driver.findElement(Users.saveButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(Users.roleMapping));
    }

}
