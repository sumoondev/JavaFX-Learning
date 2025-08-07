package com.phantom;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Group;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.gray(0));

        String iconPath = "/images/icon.png";
        Image icon = new Image(getClass().getResourceAsStream(iconPath));
        stage.getIcons().add(icon);
        stage.setTitle("Phantom Testing");
        stage.setWidth(470);
        stage.setHeight(470);
        stage.setResizable(true);
        // stage.setX(50);
        // stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press q to exit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}