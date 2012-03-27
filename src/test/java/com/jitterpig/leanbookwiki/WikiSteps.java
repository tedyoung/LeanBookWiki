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

  @Given("I'm on the '$name' page")
  @When("I go to the '$name' page")
  public void goToWikiPage(String name) {
    _wiki.goToPage(name);
  }

  @When("I create a new page called '$name'")
  public void createWikiPage(String name) {
    _wiki.createPage(name);
  }

  @Then("the '$name' page is shown")
  public void thePageIsShown(String name) {
    assertThat(_wiki.getCurrentPageName())
            .isEqualTo(name);
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
