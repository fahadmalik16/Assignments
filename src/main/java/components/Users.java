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

}
