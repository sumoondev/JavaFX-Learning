package phantom;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Group;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
// import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
// import javafx.scene.canvas.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        /* Just tried some stuff */
        
        // Group root = new Group();
        // Scene scene = new Scene(root, Color.gray(0));

        // String iconPath = "/assets/images/icon.png";
        // Image icon = new Image(getClass().getResourceAsStream(iconPath));
        // stage.getIcons().add(icon);
        // stage.setTitle("Phantom Testing");
        // stage.setWidth(470);
        // stage.setHeight(470);
        // stage.setResizable(true);
        // // stage.setX(50);
        // // stage.setY(50);
        // stage.setFullScreen(true);
        // stage.setFullScreenExitHint("Press q to exit");
        // stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        // stage.setScene(scene);
        // stage.show();

        Group root = new Group();
        Scene scene = new Scene(root,600,600,Color.SKYBLUE);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("WHOOOOOOOA!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.GREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        rectangle.setOpacity(0.3);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
            200.0,200.0,
            300.0,300.0,
            200.0,300.0
            );
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        String imagePath = "/assets/images/icon.png";

        Image image = new Image(getClass().getResourceAsStream(imagePath));
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);
        imageView.setFitWidth(150);
        imageView.setFitHeight(150);

        root.getChildren().addAll(circle,imageView);
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(text);
        root.getChildren().add(line);

        stage.setTitle("Suhan Gede");
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
