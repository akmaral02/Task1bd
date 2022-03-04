module com.example.task1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    opens com.example.task1 to javafx.fxml;
    exports com.example.task1;
    exports com.example.task1.Controller;
    opens com.example.task1.Controller to javafx.fxml;
}