module com.example.final9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.final9 to javafx.fxml;
    exports com.example.final9;
}