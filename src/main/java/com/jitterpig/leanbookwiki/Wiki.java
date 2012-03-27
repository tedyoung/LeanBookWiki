package com.jitterpig.leanbookwiki;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 *
 */
public class Wiki {

  public static final String HOME_PAGE_NAME = "Home";
  private Map<String, WikiPage> _pages = Maps.newHashMap();
  private String _currentPageName = "";

  public Wiki() {
    _pages.put(HOME_PAGE_NAME, new WikiPage());
    _currentPageName = HOME_PAGE_NAME;
  }

  public boolean isEmpty() {
    return true;
  }

  public void createPage(String pageName) {
    _pages.put(pageName, new WikiPage());
  }

  public boolean containsPage(String pageName) {
    return _pages.containsKey(pageName);
  }

  public boolean isPageEmpty(String pageName) {
    Preconditions.checkArgument(containsPage(pageName), "Wiki page named '%s' does not exist.", pageName);
    WikiPage wikiPage = _pages.get(pageName);
    return wikiPage.isEmpty();
  }

  public void goToPage(String pageName) {
    _currentPageName = pageName;
  }

  public String getCurrentPageName() {
    return _currentPageName;
  }
}
