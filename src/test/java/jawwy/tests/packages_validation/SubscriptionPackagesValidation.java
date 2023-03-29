package jawwy.tests.packages_validation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jawwy.Bases.TestBase;
import org.junit.Assert;

public class SubscriptionPackagesValidation extends TestBase {

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
       browser.jawwy.homePage.openJawwyHomePage("https://subscribe.stctv.com/");
    }

    @When("change the language to english")
    public void change_the_language_to_english() {
        browser.jawwy.homePage.changeSiteLanguage();
    }

    @When("select the country {string}")
    public void select_the_country(String country) {
        browser.jawwy.homePage.showSiteCountries();
        browser.jawwy.homePage.chooseCountry(country);
    }


    @When("check the package typ {string}")
    public void check_the_package_typ(String packageType) {
        Assert.assertEquals(browser.jawwy.homePage.getPackageTiltle(packageType),packageType);
    }

    @Then("check the package price and currency from {string} equal {string}")
    public void check_the_package_price_and_currency(String type, String value) {
        Assert.assertEquals(browser.jawwy.homePage.getPackagePrice(type),value);
        System.out.println(browser.jawwy.homePage.getPackagePrice(type));
    }

}
