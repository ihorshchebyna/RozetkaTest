package pageelements;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultItem{

    @FindBy(name = "prices_active_element_original")
    public WebElement productLabel;

    @FindBy(css = ".g-price-uah")
    public WebElement productPrice;

    @FindBy(css = ".g-i-tile-i-title.clearfix")
    public WebElement productName;

    public ResultItem(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
