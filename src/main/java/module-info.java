module java_fx.painter {
    requires javafx.controls;
    requires javafx.fxml;


    opens java_fx.painter to javafx.fxml;
    exports java_fx.painter;
}