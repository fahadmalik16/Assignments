package components;

import org.openqa.selenium.By;

public class Users {
    public static By addUserTitle = By.xpath("//div[@id='view']/div/div/h1[2]");
    public static By addUser = By.id("createUser");
    public static By IDfield = By.id("id");
    public static By usernameField = By.id("username");
    public static By emailField = By.id("email");
    public static By firstNameField = By.id("firstName");
    public static By lastNameField = By.id("lastName");
    public static By enableToogle = By.cssSelector("span.onoffswitch-switch");
    public static By emailVerifyToggle = By.id("createUser");
    public static By actionsDropdown = By.id("s2id_autogen1");
    public static By dropdownOption = By.id("ul.select2-choices");
    public static By saveButton = By.cssSelector("div.col-md-10.col-md-offset-2 > button.ng-binding.btn.btn-primary");
    public static By cancelButton = By.cssSelector("div.col-md-10.col-md-offset-2 > button.ng-binding.btn.btn-default");
    public static By successMessage = By.cssSelector("strong.ng-binding");
    public static By roleMapping = By.linkText("Role Mappings");


    public static By user = By.cssSelector("#assigned > option.ng-binding.ng-scope");
    public static By superAdmin = By.xpath("//select[@id='available']/option[5]");
    public static By addSelected = By.cssSelector("button.btn.btn-default.ng-binding");
    public static By removeSelected = By.xpath("(//button[@type='submit'])[2]");
    public static By searchField = By.xpath("//input[@type='text']");
    public static By viewAllUsers = By.xpath("//button[text()='View all users']");
    public static By username = By.xpath("td:nth-of-type(2) ");
    public static By searchButton = By.xpath("//i[@id='userSearch']");
    public static By tableRows = By.xpath("//table/tbody/tr");
    public static By tableCol = By.xpath("//table[@id='user-table']/tbody/tr");

}
