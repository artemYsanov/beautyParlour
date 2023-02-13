package com.example.beautyparlour;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerMasters {
    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Button B4;

    @FXML
    private Button BExit;

    @FXML
    private void initialize() {
        B1.setOnAction(e -> {

            WindowHair windowHair = new WindowHair();
            try {
                windowHair.start(new Stage());
                B1.getScene().getWindow().hide();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B2.setOnAction(e -> {

            WindowHair windowHair = new WindowHair();
            try {
                windowHair.start(new Stage());
                B2.getScene().getWindow().hide();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B3.setOnAction(e -> {
            WindowHair windowHair = new WindowHair();
            try {
                windowHair.start(new Stage());
                B3.getScene().getWindow().hide();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B4.setOnAction(e -> {

            WindowHair windowHair = new WindowHair();
            try {
                windowHair.start(new Stage());
                B4.getScene().getWindow().hide();

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

