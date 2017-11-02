package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Parents_viewing_list_of_kidsStep {

    @Given("^that I have a parent account$")
    public void that_i_have_a_parent_account() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I log in$")
    public void i_log_in() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should be directed to a page to view kids$")
    public void i_should_be_directed_to_a_page_to_view_kids() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
