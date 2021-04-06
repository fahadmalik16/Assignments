package steps.addUsers;

import components.Dashboard;
import components.Users;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class verifyUser {
    private WebDriver driver;

    public verifyUser(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyUserStep() {

        driver.findElement(Dashboard.usersTab).click();
        //driver.findElement(Users.viewAllUsers).click();
        //driver.findElement(Users.searchField).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(Users.viewAllUsers));
        driver.findElement(Users.viewAllUsers).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(Users.searchField));
        boolean isFound = true;


        //WebElement baseTable= driver.findElement(By.id("user-table"));
        //WebElement tableRow = baseTable.findElement(By.xpath("//table[@id='user-table']/thead/tr/th"));
      // System.out.println(driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size());
        //System.out.println(driver.findElements(By.xpath("//table/tbody/tr/td[1]")).size());
       // System.out.println(driver.findElements(By.xpath("//table/tbody/tr[1]/td[1]")).size());
       // System.out.println(driver.findElements(By.xpath("//table/tbody")).size());
       // System.out.println(Users.tableRows.findElement(driver.findElement(By.xpath("//table/tbody/tr"))));
        WebElement xyz = driver.findElements(By.xpath("//table/tbody/tr[1]/td[1]")).get(0);
        System.out.println(xyz.getText());
    }


}
