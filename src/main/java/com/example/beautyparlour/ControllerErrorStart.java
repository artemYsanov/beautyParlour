package com.example.beautyparlour;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerErrorStart {

    @FXML
    private Button B1;

    @FXML
    void initialize() {
        System.out.println("Ошибка авторизации");
        B1.setOnAction(e -> {
            B1.getScene().getWindow().hide();
        });
    }
}