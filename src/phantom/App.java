package phantom;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("css/application.css").toExternalForm());

            String iconPath = "assets/image/icon.png";
            Image icon = new Image(getClass().getResourceAsStream(iconPath));
            
            stage.setScene(scene);
            stage.getIcons().add(icon);
            stage.setTitle("JavaFX Learning");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
