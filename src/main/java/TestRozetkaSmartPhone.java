import actions.HomePageActions;
import actions.ResultPageActions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pageelements.NavigationBar;
import pageelements.SearchResults;

public class TestRozetkaSmartPhone extends BaseTest{
    private HomePageActions homePageActions;
    private ResultPageActions resultPageActions;
    private NavigationBar navigationBar;
    private SearchResults searchResults;

    @Test
    public void testTopSellerCount() {
        navigationBar = new NavigationBar(driver);
        searchResults = new SearchResults(driver);
        resultPageActions = new ResultPageActions(driver);

        navigationBar.openSmartPhoneSection(driver);
        resultPageActions.checkTopSellers(driver);
    }
}
