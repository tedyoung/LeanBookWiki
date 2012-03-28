package com.jitterpig.leanbookwiki;

/**
 *
 */
public class ICanEditAWikiPage extends WikiPageJUnitStory {

  @Override
  protected WikiSteps storyStepsInstance() {
    return new WikiSteps();
  }
}
