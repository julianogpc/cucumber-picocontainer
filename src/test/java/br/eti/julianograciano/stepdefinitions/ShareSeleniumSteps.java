package br.eti.julianograciano.stepdefinitions;

import br.eti.julianograciano.utils.SharedClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ShareSeleniumSteps {
    SharedClass sharedClass;

    public ShareSeleniumSteps(SharedClass sharedClass){
        this.sharedClass = sharedClass;
    }

    @Given("^I am on the www\\.softpost\\.org home page$")
    public void i_am_on_the_www_softpost_org_home_page() throws Throwable {
        sharedClass.getDriver().navigate().to("https://www.softpost.org/");
        sharedClass.getDriver().navigate().to("https://www.softpost.org/");
    }

    @Then("^I verify that title contains tutorials$")
    public void i_verify_that_title_contains_tutorials() throws Throwable {
        Assert.assertTrue( sharedClass.getDriver().getTitle().toLowerCase().contains("tutorials") );
    }

    @Then("^I verify that title contains tutooorials$")
    public void i_verify_that_title_contains_tutooorials() throws Throwable {
        Assert.assertTrue( sharedClass.getDriver().getTitle().toLowerCase().contains("tutooorials") );
    }
}
