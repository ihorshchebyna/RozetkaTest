package pageelements;

import Helpers.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface Element extends WebElement, WrapsElement, Locatable {
    boolean elementWired();
}
