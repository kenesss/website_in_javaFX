module com.example.softfinalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.softfinalproject to javafx.fxml;
    exports com.example.softfinalproject;
}