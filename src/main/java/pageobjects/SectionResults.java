package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageelements.ResultItem;

import java.util.List;

public class SectionResults {

    @FindBy(xpath = "//a[@href='https://rozetka.com.ua/mobile-phones/c80003/page=2;preset=smartfon/']")
    public WebElement secondPage;

    @FindBy(xpath = "//a[@href='https://rozetka.com.ua/mobile-phones/c80003/page=3;preset=smartfon/']")
    public WebElement thirdPage;

    @FindBy(xpath = "//*[@class = 'g-i-tile g-i-tile-catalog']")
    public List<WebElement> resultItems;

    public SectionResults(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
