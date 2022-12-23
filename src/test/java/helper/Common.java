package helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import setups.BrowserPool;

public class Common {

    WebDriverWait wait = new WebDriverWait(BrowserPool.getChrome(),Duration.ofSeconds(30));

    public void delay(int delay) throws InterruptedException {
        Thread.sleep(delay);
    }

    public void goToUrl(String url) {
        BrowserPool.getChrome().manage().window().maximize();
        BrowserPool.getChrome().navigate().to(url);
    }

    public void clickXpath(String element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).click();
    }

    public void clickId(String element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element))).click();
    }
}
