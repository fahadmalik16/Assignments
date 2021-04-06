package steps.addUsers;

import components.Dashboard;
import components.passwords;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setPassword {
    private WebDriver driver;

    public setPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void settingPassword() {

        driver.findElement(passwords.credentials).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(passwords.pass));
        driver.findElement(passwords.pass).click();
        driver.findElement(passwords.pass).clear();
        driver.findElement(passwords.pass).sendKeys("Fahad1234!");
        driver.findElement(passwords.confirmPass).click();
        driver.findElement(passwords.confirmPass).clear();
        driver.findElement(passwords.confirmPass).sendKeys("Fahad1234!");
        driver.findElement(passwords.temporary).click();
        driver.findElement(passwords.resetPass).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(passwords.setPassButton));
        driver.findElement(passwords.setPassButton).click();
        driver.findElement(passwords.profileButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(passwords.signOut));
        driver.findElement(passwords.signOut).click();
        //driver.quit();
    }
}

