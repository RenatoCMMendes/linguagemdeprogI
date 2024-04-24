module com.example.e1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.management;
    requires java.desktop;

    opens com.example.e1 to javafx.fxml;
    exports com.example.e1;
}