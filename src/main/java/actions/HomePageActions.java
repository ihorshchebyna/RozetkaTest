package actions;

import org.openqa.selenium.WebDriver;
import pageelements.NavigationBar;
import pageobjects.HomePage;

public class HomePageActions {
    private HomePage homePage;
    private WebDriver driver;
    private NavigationBar navigationBar;

    public HomePageActions(WebDriver driver) {
        this.homePage = new HomePage(driver);
        this.navigationBar = new NavigationBar(driver);
        this.driver = driver;
    }
}
