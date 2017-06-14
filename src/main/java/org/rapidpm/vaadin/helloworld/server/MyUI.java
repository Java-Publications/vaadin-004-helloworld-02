package org.rapidpm.vaadin.helloworld.server;

import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

/**
 *
 */
public class MyUI extends UI {

  public static final String BUTTON_ID = "buttonID";
  public static final String INPUT_ID = "inputID";
  public static final String OUTPUT_ID = "outputID";

  @Override
  protected void init(VaadinRequest request) {
    setContent(new Label("Hello World"));
  }
}
