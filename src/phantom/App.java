package phantom;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        {// work 1

            // Group root = new Group();
            // Scene scene = new Scene(root, Color.BLACK);

            // String imagePath = "icon.png";
            // Image icon = new Image(getClass().getResourceAsStream(imagePath));
            // stage.getIcons().add(icon);
            // stage.setTitle("Stage Demo Program");
            // stage.setWidth(420);
            // stage.setHeight(420);
            // // stage.setResizable(false);
            // // stage.setX(50);
            // // stage.setY(50);
            // stage.setFullScreen(true);
            // stage.setFullScreenExitHint("You cant escape unless you press q");
            // stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
            
            // stage.setScene(scene);
            // stage.show();
        }
        
        {// work 2

            // Group root = new Group();
            // Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);

            // Text text = new Text();
            // text.setText("JavaFX learning");
            // text.setX(50);
            // text.setY(50);
            // text.setFont(Font.font("Verdana",50));
            // text.setFill(Color.LIMEGREEN);

            // Line line = new Line();
            // line.setStartX(200);
            // line.setStartY(200);
            // line.setEndX(500);
            // line.setEndY(200);
            // line.setStrokeWidth(5);
            // line.setStroke(Color.RED);
            // line.setOpacity(0.5);
            // line.setRotate(45);

            // Rectangle rectangle = new Rectangle();
            // rectangle.setX(100);
            // rectangle.setY(100);
            // rectangle.setWidth(100);
            // rectangle.setHeight(100);
            // rectangle.setFill(Color.BLUE);
            // rectangle.setStrokeWidth(5);
            // rectangle.setStroke(Color.BLACK);

            // Polygon triangle = new Polygon();
            // triangle.getPoints().setAll(
            //     200.0, 200.0,
            //     300.0, 300.0,
            //     200.0, 300.0
            // );
            // triangle.setFill(Color.YELLOW);

            // Circle circle = new Circle();
            // circle.setCenterX(350);
            // circle.setCenterY(350);
            // circle.setRadius(50);
            // circle.setFill(Color.ORANGE);
            // circle.setStroke(Color.BLACK);
            // circle.setStrokeWidth(5);

            // String imagePath = "icon.png";
            // Image icon = new Image(getClass().getResourceAsStream(imagePath));

            // ImageView imageView = new ImageView(icon);
            // imageView.setX(400);
            // imageView.setY(400);
            
            // stage.getIcons().add(icon);
            // stage.setTitle("Stage Demo Program");
            // root.getChildren().add(text);
            // root.getChildren().add(line);
            // root.getChildren().add(rectangle);
            // root.getChildren().add(triangle);
            // root.getChildren().add(circle);
            // root.getChildren().add(imageView);
            // stage.setScene(scene);
            // stage.show();
        }
        
        {// work 3

            try {

                    Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
                    Scene scene = new Scene(root);
                    // scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
                    
                    // for more than one scene
                    String css = this.getClass().getResource("application.css").toExternalForm();
                    scene.getStylesheets().add(css);
                    
                    String imagePath = "icon.png";
                    Image icon = new Image(getClass().getResourceAsStream(imagePath));
                    stage.getIcons().add(icon);
                    stage.setTitle("JavaFX Learning");
                    stage.setScene(scene);
                    stage.show();

                } catch(Exception e) {

                    e.printStackTrace();

                }
        }
    
        {// work 4

            try {
                
                Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
