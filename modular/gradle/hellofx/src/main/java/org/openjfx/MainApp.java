package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        // Test JavaFX version
        String javaFXSettingVersion = trimEAVersion(System.getProperty("settings.javafx.version"));
        if (!javaFXSettingVersion.equals(javafxVersion)) {
            System.out.println("Mismatch of JavaFX version occurred. Expected: '" + javaFXSettingVersion + "' but found: '" + javafxVersion + "'.");
            System.exit(1);
        }

        System.out.println("Starting Application...");
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();

        System.out.println("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");

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
        launch(args);
    }

    private String trimEAVersion(String property) {
        if (property.contains("+")) {
            property = property.substring(0, property.indexOf("+"));
        }
        return property;
    }

}
