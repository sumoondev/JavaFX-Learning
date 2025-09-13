package phantom;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;


    public void up(ActionEvent e) {
        System.out.println("Up");
        myCircle.setCenterY(y=y-5);
    }

    public void down(ActionEvent e) {
        System.out.println("Down");
        myCircle.setCenterY(y=y+5);
    }

    public void left(ActionEvent e) {
        System.out.println("Left");
        myCircle.setCenterX(x=x-5);
    }

    public void right(ActionEvent e) {
        System.out.println("Right");
        myCircle.setCenterX(x=x+5);
    }
}
