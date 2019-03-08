package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageelements.NavigationBar;

public class HomePage{
    WebDriver driver;

    @FindBy(css = ".menu-categories.menu-categories_type_main")
    public NavigationBar navigationBar;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}
