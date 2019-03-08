package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginationPanel {

    @FindBy(css = "#page1")
    public WebElement firstPage;

    @FindBy(css = "#page2")
    public WebElement secondPage;

    @FindBy(css = "#page3")
    public WebElement thirdPage;

    public PaginationPanel(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
