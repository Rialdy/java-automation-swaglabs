package setups;

import org.openqa.selenium.WebDriver;

public class BrowserPool {
    private static WebDriver chromeDriver;
    
    public static WebDriver getChrome() {
        return BrowserPool.chromeDriver;
    }

    public void setChrome(WebDriver chrome) {
        BrowserPool.chromeDriver = chrome;
    }
}
