package com.jitterpig.leanbookwiki;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.fest.assertions.Assertions.assertThat;

/**
 *
 */
public class WikiSteps {

  private Wiki _wiki;

  @Given("^a new wiki$")
  public void aNewWiki() {
    _wiki = new Wiki();
  }

  //(?:I'm logged|I log)
  @Given("^I'm on the '(\\w+)' page$")
  @When("^I go to the '(\\w+)' page$")
  public void goToWikiPage(String name) {
    _wiki.goToPage(name);
  }

  @When("^I create a new page called '(\\w+)'$")
  public void createWikiPage(String name) {
    _wiki.createPage(name);
  }

  @Then("^the '(\\w+)' page is shown$")
  public void thePageIsShown(String name) {
    assertThat(_wiki.getCurrentPageName())
            .isEqualTo(name);
  }

  @Then("^the wiki page '(\\w+)' exists$")
  public void theCurrentPageHasTheSpecifiedTitle(String name) {
    assertThat(_wiki.containsPage(name))
            .as("The wiki does NOT contain a page named " + name)
            .isTrue();
  }

  @Then("^the page '(\\w+)' is empty$")
  public void thePageIsEmpty(String name) {
    assertThat(_wiki.isPageEmpty(name))
            .as("The wiki page " + name + " was NOT empty.")
            .isTrue();
  }

  @When("^I change the contents of '([\\w\\d\\s]+)' to be '(.+)'$")
  public void changeContentsOfPage(String pageName, String text) {
    WikiPage wikiPage = _wiki.getPage(pageName);
    wikiPage.setText(text);
  }

  @Then("^the page '([\\w\\d\\s]+)' contains '(.+)'$")
  public void thePageContains(String pageName, String text) {
    assertThat(_wiki.getPage(pageName).getText())
            .contains(text);
  }

  //  @Then("^the page has a link to 'My New Page'$$")
  public void thenThePageHasALinkToMyNewPage() {
    // PENDING
  }

}
