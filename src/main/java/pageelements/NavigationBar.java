package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationBar {

    @FindBy(xpath = "//*[@class = 'menu-categories__link' and @href = 'https://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/']")
    public WebElement smartTvElectroSection;

    @FindBy(xpath = "//div/a[contains(text(), 'Смартфоны')]")
    public WebElement smartPhonesSection;

    @FindBy(xpath = "//a[contains(text(), 'Телефоны')]")
    public WebElement phonesSection;

    public NavigationBar(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void openSmartPhoneSection(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(smartTvElectroSection)).click();
        wait.until(ExpectedConditions.elementToBeClickable(phonesSection)).click();
        wait.until(ExpectedConditions.elementToBeClickable(smartPhonesSection)).click();
    }

}

