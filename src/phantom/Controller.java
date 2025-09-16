package phantom;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {
    
    @FXML
    Label printLabel;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void btn1 (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = loader.load();
        displayName("I am fine");
        
        scene = new Scene(root);
                
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene.getStylesheets().add(getClass().getResource("css/application.css").toExternalForm());


        stage.setScene(scene);
        stage.show();
    }

    public void btn2 (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = loader.load();
        displayName("I am not fine");
        
        scene = new Scene(root);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene.getStylesheets().add(getClass().getResource("css/application.css").toExternalForm());

        stage.setScene(scene);
        stage.show();
    }
    
    public void displayName(String printData) {
        printLabel.setText(printData);
    }
}
