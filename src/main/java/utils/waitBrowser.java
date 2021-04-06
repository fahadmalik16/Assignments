package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitBrowser{

    public static WebDriverWait waits (WebDriver driver) {
        WebDriverWait wait1 = new WebDriverWait(driver,5);
        return wait1;
    }


}
