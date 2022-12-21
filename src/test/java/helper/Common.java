package helper;

import setups.BrowserPool;

public class Common {

    public void delay(int delay) throws InterruptedException {
        Thread.sleep(delay);
    }

    public void goToUrl(String url) {
        BrowserPool.getChrome().manage().window().maximize();
        BrowserPool.getChrome().navigate().to(url);
    }
    
}
