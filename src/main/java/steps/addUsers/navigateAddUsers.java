package steps.addUsers;

import components.Dashboard;
import components.Users;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class navigateAddUsers {
    private WebDriver driver;
    public navigateAddUsers(WebDriver driver){
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
}
