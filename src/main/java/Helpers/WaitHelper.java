package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setWebDriver(WebDriver wdriver) {
        driver.set(wdriver);
    }

    public static synchronized WebDriverWait getElementWait() {
        return new WebDriverWait(driver.get(), 60);
    }

    public static synchronized WebDriver getDriver() {
        return driver.get();
    }
}
