module com.phantom {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.phantom to javafx.fxml;
    exports com.phantom;
}
