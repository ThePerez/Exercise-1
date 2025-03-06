package steps;

import io.cucumber.java.en.Given;
import pages.principal;

public class practiceSteps {

    principal landingPage = new principal();

    @Given("the user navigates to www.amazon.com")
    public void iNavigateToAmazon() {
        landingPage.navigateToAmazon();
    }
}
