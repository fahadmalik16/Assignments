package components;

import org.openqa.selenium.By;

public class usersTable {
    public static By viewUsers = By.xpath("//button[@id='viewAllUsers']");
    public static By deleteButton = By.xpath("//td[normalize-space()='admin']//following-sibling::td[text()='Delete']");
    public static By deleteConfirm = By.cssSelector("button.ng-binding.btn.btn-danger");



}
