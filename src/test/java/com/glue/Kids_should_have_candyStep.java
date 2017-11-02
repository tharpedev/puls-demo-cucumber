package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Kids_should_have_candyStep {

    @Given("^that it is halloween$")
    public void that_it_is_halloween() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^i knocked on a doo$")
    public void i_knocked_on_a_door() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^i get candy$")
    public void i_get_candy() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
