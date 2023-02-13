package com.example.beautyparlour;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerSignUp {

    @FXML
    private Button B1;

    @FXML
    private Button BExit;

    @FXML
    private TextField TF1;

    @FXML
    private TextField TF2;

    @FXML
    private PasswordField PF3;

    @FXML
    void initialize(){

        B1.setOnAction(e -> {

            signUpNewUser();

            WindowStart windowStart = new WindowStart();
            try {
                windowStart.start(new Stage());
                B1.getScene().getWindow().hide();
                System.out.println("Авторизация");
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        BExit.setOnAction(e -> {
            System.out.println("Выход из приложения");
                BExit.getScene().getWindow().hide();
        });
    }

    private void signUpNewUser() {
        DateBase dbBase = new DateBase();

        String FirstName = TF1.getText();
        String Login = TF2.getText();
        String Password = PF3.getText();

        Password = MD5.hashingPassword(Password);

        Users users = new Users(FirstName, Login, Password);

        dbBase.signUpUser(users);
    }
}
