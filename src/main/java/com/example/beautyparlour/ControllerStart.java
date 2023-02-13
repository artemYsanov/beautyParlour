package com.example.beautyparlour;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerStart {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button BExit;

    @FXML
    private PasswordField PF1;

    @FXML
    private TextField TF1;

    @FXML
    void initialize() {

        B1.setOnAction(event -> {
            String login = TF1.getText().trim();
            String pass = PF1.getText().trim();


            if(!login.equals("") && !pass.equals(""))
                loginUsers(login, pass);

            else {
                try {
                    WindowErrorStart windowErrorStart = new WindowErrorStart();
                    try {
                        windowErrorStart.start(new Stage());
                        B1.getScene().getWindow();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    System.out.println("Error");
                } catch (RuntimeException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        B2.setOnAction(e -> {

            System.out.println("Регистрация");

            WindowSignUp windowSignUp = new WindowSignUp();
            try {
                windowSignUp.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        BExit.setOnAction(e -> {
            System.out.println("Выход из приложения");

            WindowExit windowExit = new WindowExit();
            try {
                windowExit.start(new Stage());
                BExit.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    private void loginUsers(String login, String pass) {
        DateBase dbBase = new DateBase();
        Users users =new Users();
        users.setLogin(login);
        users.setPassword(MD5.hashingPassword(pass));
        ResultSet result = dbBase.getUser(users);

        int counter = 0;

        try {
            while(result.next()) {
                counter++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (counter >= 1 && TF1 != null && PF1 != null) {
            try {
                WindowMasters windowMasters = new WindowMasters();
                try {
                    windowMasters.start(new Stage());
                    B1.getScene().getWindow().hide();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Авторизация правильная");
        } else {
            WindowErrorStart windowErrorStart = new WindowErrorStart();
            try {
                windowErrorStart.start(new Stage());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Авторизация неправильная");

        }
    }
}
