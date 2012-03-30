package com.jitterpig.leanbookwiki;

/**
 *
 */
public class WikiPage {
  private String _contents;

  public boolean isEmpty() {
    return true;
  }

  public String getText() {
    return _contents;
  }

  public void setText(String text) {
    _contents = text;
  }
}
