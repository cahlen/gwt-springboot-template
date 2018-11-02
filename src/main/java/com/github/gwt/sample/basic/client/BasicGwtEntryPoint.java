package com.github.gwt.sample.basic.client;

import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class BasicGwtEntryPoint implements EntryPoint {

    private static Logger logger = Logger
            .getLogger(BasicGwtEntryPoint.class.getName());

    @Override
    public void onModuleLoad() {
        Button button = new Button("Click me");
        button.addClickHandler(clickEvent -> {
            Window.alert("Foo bar");
            logger.info("Hello World!");
        });

        RootPanel.get("helloButton").add(button);
    }
}