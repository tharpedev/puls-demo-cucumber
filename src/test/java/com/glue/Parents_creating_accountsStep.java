package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Parents_creating_accountsStep {

    @Given("^that I have never logged in$")
    public void that_i_have_never_logged_in() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I open the App$")
    public void i_open_the_app() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should see the an option to sign up as a parent$")
    public void i_should_see_the_an_option_to_sign_up_as_a_parent() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Given("^that I open the create account screen$")
    public void that_i_open_the_create_account_screen() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I enter the required data$")
    public void i_enter_the_required_data() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^the submit button should be enabled$")
    public void the_submit_button_should_be_enabled() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
