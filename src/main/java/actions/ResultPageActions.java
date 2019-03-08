package actions;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.SectionResults;

import java.util.List;
import java.util.stream.Collectors;

public class ResultPageActions {
    private SectionResults sectionResults;
    private WebDriver driver;

    public ResultPageActions(WebDriver driver) {
        this.sectionResults = new SectionResults(driver);
        this.driver = driver;
    }

    private List<WebElement> findAllResult() {
        return sectionResults.resultItems;
    }


    /*
    findTopSellerItems() returns all the items on the page with Top Seller label
     */
    private List<WebElement> findTopSellerItems() {
        return findAllResult()
                .stream()
                .filter(res -> {
                            try {
                                res.findElement(By.cssSelector("i[class='g-tag-icon-small-popularity g-tag-i sprite']"));
                                System.out.println("Product Name - "
                                        + res.findElement(By.cssSelector("div[class='g-i-tile-i-title clearfix']")).getText());
                                System.out.println("Price in UAH - "
                                        + res.findElement(By.className("g-price-uah")).getText());
                                System.out.println("\n");
                                return true;
                            } catch (NoSuchElementException e) {
                                return false;
                            }
                        }
                )
                .collect(Collectors.toList());
    }

    private void navigateToTheSecondPage(WebDriver driver) {
        wait(driver).until(ExpectedConditions.elementToBeClickable(sectionResults.secondPage)).click();
        //wait for page loaded to avoid StaleElementException
//        wait(driver).until(ExpectedConditions.elementToBeClickable(sectionResults.secondPage));
    }

    private void navigateToTheThirdPage(WebDriver driver) {
        wait(driver).until(ExpectedConditions.elementToBeClickable(sectionResults.thirdPage)).click();
        //wait for page loaded to avoid StaleElementException
//        wait(driver).until(ExpectedConditions.elementToBeClickable(sectionResults.thirdPage));
    }


    public void checkTopSellers(WebDriver driver) {
        List<WebElement> firstPageResults = findTopSellerItems();
        navigateToTheSecondPage(driver);
        wait(driver).until(ExpectedConditions.elementToBeClickable(sectionResults.thirdPage));
        List<WebElement> secondPageResults = findTopSellerItems();
        navigateToTheThirdPage(driver);
        wait(driver).until(ExpectedConditions.elementToBeClickable(sectionResults.thirdPage));
        List<WebElement> thirdPageResults = findTopSellerItems();


        SoftAssertions soft = new SoftAssertions();

        soft.assertThat(firstPageResults.size())
                .as("Inappropriate amount of top sellers on the first page")
                .isEqualTo(3);
        soft.assertThat(secondPageResults.size())
                .as("Inappropriate amount of top sellers on the second page")
                .isEqualTo(3);
        soft.assertThat(thirdPageResults.size())
                .as("Inappropriate amount of top sellers on the third page")
                .isEqualTo(3);
        soft.assertAll();
    }

    private WebDriverWait wait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        return wait;
    }
}
