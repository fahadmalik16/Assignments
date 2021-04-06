package components;

import org.openqa.selenium.By;

public class passwords {

    public static By credentials = By.linkText("Credentials");
    public static By pass = By.id("newPas");
    public static By confirmPass = By.id("confirmPas");
    public static By temporary = By.xpath("//span[@class='onoffswitch-active ng-binding']");
    public static By resetPass = By.xpath("//button[@type='submit']");
    public static By setPassButton = By.cssSelector("button.ng-binding.btn.btn-danger");

    public static By profileButton = By.linkText("Super Admin");
    public static By signOut = By.linkText("Sign Out");
}
