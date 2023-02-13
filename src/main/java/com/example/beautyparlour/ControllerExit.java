package com.example.beautyparlour;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerExit {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    void initialize(){
        B1.setOnAction(e -> {
            B1.getScene().getWindow().hide();
            System.out.println("Выход из системы");
        });

        B2.setOnAction(e -> {
            WindowStart windowStart = new WindowStart();
            try {
                windowStart.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Отмена");
        });
    }
}