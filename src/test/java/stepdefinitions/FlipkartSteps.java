package stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import Base.BaseUtils;
import Pages.FlipkartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSteps {

    WebDriver driver;
    FlipkartPage flipkartPage;

    @Given("User opens Flipkart website")
    public void user_opens_flipkart_website() {

        BaseUtils base = new BaseUtils();

        base.LaunchApplication();

        driver = BaseUtils.driver;

        driver.get("https://www.flipkart.com/");

        flipkartPage = new FlipkartPage();
    }

    @When("User closes the popup")
    public void userClosesThePopup() {

        BaseUtils base = new BaseUtils();

        base.popuphandling(flipkartPage.closePopup);
    }

    @When("User searches for {string}")
    public void userSearchesFor(String string) {

        BaseUtils base = new BaseUtils();

        base.EnterText(flipkartPage.searchBox, string);
    }

    @When("User SEARCHES AND PRINT ALL {string} products")
    public void userSEARCHESANDPRINTALLProducts(String string) {

        BaseUtils base = new BaseUtils();

        base.PrintAllProduct(flipkartPage.productNames);
    }

    @Then("Apple iPhone products should be displayed")
    public void appleIPhoneProductsShouldBeDisplayed() {

        System.out.println("Product count = " + flipkartPage.productNames.size());

        assertTrue(
            "Apple iPhone products are not displayed",
            flipkartPage.productNames.size() > 0
        );
    }
}