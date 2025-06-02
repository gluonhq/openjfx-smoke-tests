package org.openjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;

public class FXMLController {
    
    @FXML
    private Label label;

    @FXML
    private WebView webView;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    public void initialize() throws Exception {
        webView.getEngine().load(getClass().getResource("hello.html").toURI().toString());
    }
}
