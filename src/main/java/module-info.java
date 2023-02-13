module com.example.beautyparlour {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.beautyparlour to javafx.fxml;
    exports com.example.beautyparlour;
}