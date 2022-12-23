package pages;

import helper.Common;

public class LoginPage {
    private String webAddress = "https://www.saucedemo.com/";
    private String loginButton = "login-button";
    private int delay = 1000;

    Common common = new Common();

    public void goToPage() throws InterruptedException {
        common.goToUrl(webAddress);
        common.delay(delay);
    }

    public void clickLoginButton() throws InterruptedException {
        common.clickId(loginButton);
    }
    
}
