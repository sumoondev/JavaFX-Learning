package phantom;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scene1Controller {
    {// work 1

        // private Stage stage;
        // private Scene scene;
        // private Parent root;

        // public void switchToScene1 (ActionEvent event) throws IOException {
        //     root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        //     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        //     scene = new Scene(root);
        //     stage.setScene(scene);
        //     stage.show();
        // }

        // public void switchToScene2 (ActionEvent event) throws IOException{
        //     root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        //     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        //     scene = new Scene(root);
        //     stage.setScene(scene);
        //     stage.show();
        // }
    }

    @FXML
    TextField nameTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void login (ActionEvent event) throws IOException {

        String username = nameTextField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = loader.load();

        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.displayName(username);

        scene2Controller.imageImage(username+".png");

        // root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        
        String imagePath = "icon.png";
        Image icon = new Image(getClass().getResourceAsStream(imagePath));

        stage.getIcons().add(icon);
        stage.setTitle("Welcome " + username);
        stage.setScene(scene);
        stage.show();
    }
}
