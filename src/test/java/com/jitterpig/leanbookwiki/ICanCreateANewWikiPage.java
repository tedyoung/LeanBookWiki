package com.jitterpig.leanbookwiki;

/**
 *
 */
public class ICanCreateANewWikiPage extends WikiPageJUnitStory {

  @Override
  protected WikiSteps storyStepsInstance() {
    return new WikiSteps();
  }
}
