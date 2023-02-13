package com.example.beautyparlour;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerHair {

    @FXML
    private Button B1;

    @FXML
    private Button BExit;

    @FXML
    void initialize() {
        B1.setOnAction(e -> {

            WindowAgentTelephone windowAgentTelephone = new WindowAgentTelephone();
            try {
                windowAgentTelephone.start(new Stage());
                B1.getScene().getWindow().hide();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        BExit.setOnAction(event -> {
            System.out.println("Выход из приложения");
            BExit.getScene().getWindow().hide();

        });
    }
}
