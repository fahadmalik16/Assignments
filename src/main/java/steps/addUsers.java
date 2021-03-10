package steps;

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

    public void navigateToAddUserForm(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard.usersTab));
        driver.findElement(Dashboard.usersTab).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(Users.addUser));
        driver.findElement(Users.addUser).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(Users.usernameField));
    }
    
    public void addUsersAction(){

        driver.findElement(Users.usernameField).click();
        driver.findElement(Users.usernameField).clear();
        driver.findElement(Users.usernameField).sendKeys("xyzuser");
        driver.findElement(Users.emailField).click();
        driver.findElement(Users.emailField).clear();
        driver.findElement(Users.emailField).sendKeys("abcd@gmail.com");
        driver.findElement(Users.firstNameField).click();
        driver.findElement(Users.firstNameField).clear();
        driver.findElement(Users.firstNameField).sendKeys("football");
        driver.findElement(Users.lastNameField).click();
        driver.findElement(Users.lastNameField).clear();
        driver.findElement(Users.lastNameField).sendKeys("hockey");
        driver.findElement(Users.actionsDropdown).click();
        //driver.findElement(Users.dropdownOption).click();
        //elect dropdownElement = new Select(driver.findElement(Users.actionsDropdown));
        //dropdownElement.selectByValue("CONFIGURE_TOTP");
        driver.findElement(Users.saveButton).click();

    }

}
