package steps;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginStep {

    LoginPage LoginPage = new LoginPage();

    @Given("User go to login page")
    public void userGoToLoginPage() throws Throwable {
        LoginPage.goToPage();
    }
    
}
