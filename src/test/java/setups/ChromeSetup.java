package setups;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSetup extends BrowserPool{
    ChromeDriver chrome;
    
    protected void chromeStart() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        chrome = new ChromeDriver();
        setChrome(chrome);
    }

    protected void chromeStop() {
        chrome.close();
    }
}
