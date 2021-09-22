package org.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        System.out.println("Starting Application...");
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();

        System.out.println(l.getText());
        if (System.getProperty("javafx.platform") == null) {
            PauseTransition pause = new PauseTransition(Duration.seconds(2));
            pause.setOnFinished(f -> {
                System.out.println("Closing Application...");
                System.exit(0);
            });
            pause.play();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}