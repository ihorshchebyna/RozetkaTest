import actions.ResultPageActions;
import org.junit.jupiter.api.Test;
import pageobjects.HomePage;

public class TestRozetkaSmartPhone extends BaseTest{
    private ResultPageActions resultPageActions;
    private HomePage homePage;

    @Test
    public void testTopSellerCount() {
        homePage = new HomePage(driver);
        resultPageActions = new ResultPageActions(driver);

        homePage.openSmartPhoneSection(driver);
        resultPageActions.checkTopSellers(driver);
    }
}
