package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResults {

    @FindBy(css = ".g-i-tile.g-i-tile-catalog")
    public List<ResultItem> resultItems;

    public SearchResults(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
