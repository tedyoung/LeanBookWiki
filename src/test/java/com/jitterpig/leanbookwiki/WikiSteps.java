package com.jitterpig.leanbookwiki;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.fest.assertions.Assertions.assertThat;

/**
 *
 */
public class WikiSteps {

  private Wiki _wiki;
  private String _pageRequested;

  @Given("a new wiki")
  public void aNewWiki() {
    _wiki = new Wiki();
  }

  @Given("that the wiki is empty")
  public void theWikiIsEmpty() {
    aNewWiki();
    assertThat(_wiki.isEmpty())
            .as("The wiki is NOT empty.")
            .isTrue();
  }

  @When("I go to the '$name' page")
  public void goToWikiPage(String name) {
    _pageRequested = name;
  }

  @When("a new wiki page called '$name' is created")
  public void createWikiPage(String name) {
    _wiki.createPage(name);
  }

  @Then("the wiki page '$name' exists")
  public void theCurrentPageHasTheSpecifiedTitle(String name) {
    assertThat(_wiki.containsPage(name))
            .as("The wiki does NOT contain a page named " + name)
            .isTrue();
  }

  @Then("the page '$name' is empty")
  public void thePageIsEmpty(String name) {
    assertThat(_wiki.isPageEmpty(name))
            .as("The wiki page " + name + " was NOT empty.")
            .isTrue();
  }

}
