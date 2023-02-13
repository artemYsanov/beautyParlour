package com.example.beautyparlour;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerAgentTelephone {

    @FXML
    private Button BExit;
    @FXML
    private Button B1;

    @FXML
    void initialize() {
        B1.setOnAction(event -> {
            WindowMasters windowMasters = new WindowMasters();
            try {
                windowMasters.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        BExit.setOnAction(e -> {
            System.out.println("Выход из приложения");
                BExit.getScene().getWindow().hide();
        });
    }
}