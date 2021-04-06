package steps.addUsers;

import components.Dashboard;
import components.Users;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class roleMapping {
    private WebDriver driver;

    public roleMapping(WebDriver driver) {
        this.driver = driver;
    }

    public void roleMapStep(String path) {
        //Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElement(Users.roleMapping));
        driver.findElement(Users.roleMapping).click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(Users.user));
        driver.findElement(Users.user).click();
        driver.findElement(Users.removeSelected).click();
        driver.findElement(By.xpath(path)).click();
        driver.findElement(Users.addSelected).click();

       // driver.findElement(Users.addUser).click();

    }
}
