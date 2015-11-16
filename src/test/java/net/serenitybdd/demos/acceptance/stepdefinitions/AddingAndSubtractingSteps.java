package net.serenitybdd.demos.acceptance.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddingAndSubtractingSteps {

    @Given("^(.*) want to add two numbers (\\d+) and (\\d+)$")
    public void i_want_to_add_two_numbers(String actorName, int a, int b) throws Throwable {
//        throw new PendingException();
    }

    @When("^(?:he|she) add (\\d+) and (\\d+)$")
    public void add_and(int a, int b) throws Throwable {
//        throw new PendingException();
    }

    @Then("^(?:he|she) should get (\\d+)$")
    public void should_get(int expectedResult) throws Throwable {
//        throw new PendingException();
    }


}
