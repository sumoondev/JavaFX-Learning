package phantom;

import java.io.IOException;
import java.io.InputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene2Controller {
    
    @FXML
    Label nameLabel;
    
    @FXML
    private Button logoutButton;
    
    @FXML
    private AnchorPane scenePane;

    @FXML
    private ImageView userImage;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void displayName(String username) {
        nameLabel.setText(username);
    }

    public void imageImage(String imageName) {
        Image photo = loadImageWithFallback(imageName, "newUser.png");
        // ImageView imageView = new ImageView(photo);

        userImage.setImage(photo);

    }

    private Image loadImageWithFallback(String mainImage, String fallbackImage) {
        InputStream stream = getClass().getResourceAsStream(mainImage);
        if (stream != null) {
            return new Image(stream);
        } else {
            InputStream fallbackStream = getClass().getResourceAsStream(fallbackImage);
            if (fallbackStream != null) {
                return new Image(fallbackStream);
            } else {
                // Optional: return an empty image or throw exception if even fallback is missing
                System.err.println("Both " + mainImage + " and " + fallbackImage + " not found!");
                return new Image("https://via.placeholder.com/150"); // online placeholder
            }
        }
    }
    

    public void logout(ActionEvent event) throws IOException {

        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you really want to exit?:");

        if(alert.showAndWait().get() == ButtonType.OK) {

            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }
}
