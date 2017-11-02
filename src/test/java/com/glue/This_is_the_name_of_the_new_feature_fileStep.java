package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class This_is_the_name_of_the_new_feature_fileStep {

    @Given("^that I create a new feature file$")
    public void that_i_create_a_new_feature_file() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I make a scenario and click save$")
    public void i_make_a_scenario_and_click_save() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I will see changed in git$")
    public void i_wil_see_changed_in_git() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
