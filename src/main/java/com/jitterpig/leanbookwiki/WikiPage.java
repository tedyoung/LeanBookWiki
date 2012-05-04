package com.jitterpig.leanbookwiki;

import org.tautua.markdownpapers.Markdown;
import org.tautua.markdownpapers.parser.ParseException;

import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;

/**
 *
 */
public class WikiPage {
  private String _contents;

  public boolean isEmpty() {
    return true;
  }

  public String getAsMarkdown() {
    return _contents;
  }

  public void setText(String text) {
    _contents = text;
  }

  public String getAsHtml() {
    StringWriter out = new StringWriter();
    try {
      new Markdown().transform(new StringReader(_contents), out);
      return out.toString();
    } catch (ParseException e) {
      return "";
    }
  }
}
