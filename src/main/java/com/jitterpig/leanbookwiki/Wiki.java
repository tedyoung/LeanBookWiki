package com.jitterpig.leanbookwiki;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 *
 */
public class Wiki {

  Map<String, WikiPage> _pages = Maps.newHashMap();

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
}
