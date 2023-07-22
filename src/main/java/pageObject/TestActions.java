package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestActions {
    public WebDriver driver;
    public TestActions pause(long milisecond) {
        try {
            Thread.sleep(milisecond);
        } catch (InterruptedException e) {
            System.out.printf("Something went wrong when invole pause(%d)%n", milisecond);
            e.printStackTrace();
        }
        return this;
    }

    public WebElement checkExisting(WebElement element, boolean visible) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (visible) {
            try {
                wait.until(ExpectedConditions.visibilityOf(element));
                wait.until(ExpectedConditions.elementToBeClickable(element));
                return element;
            } catch (NoSuchElementException e) {
                System.out.printf("Could not find %s", e);
            }
        } else {
            try {
                wait.until(ExpectedConditions.invisibilityOf(element));
                return element;
            } catch (NoSuchElementException e) {
                System.out.printf("Could not find %s", e);
            }
        }
        return element;
    }

    public TestActions sendKeys(WebElement element, String value, boolean isVisible) {
        checkExisting(element, isVisible).sendKeys(value);
        return this;
    }

    public TestActions clearThenSendKeys(WebElement element, String value, boolean isVisible) {
        WebElement e = checkExisting(element, isVisible);
        e.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE); // Mô phỏng hành động giữ nút Ctrl + A và sau đó ấn
        // Delete
        e.sendKeys(value);
        return this;
    }

    public TestActions click(WebElement element, boolean isVisible) {
        checkExisting(element, isVisible).click();
        return this;
    }

    public TestActions uncheck(WebElement invincibleElement, WebElement clickableElement, boolean isVisible) {
        if (checkExisting(invincibleElement, isVisible).isSelected()) {
            clickableElement.click();
        }
        return this;
    }
}
