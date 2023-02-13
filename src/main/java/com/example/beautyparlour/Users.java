package com.example.beautyparlour;

public class Users {
    private String FirstName;
    private String Login;
    private String Password;

    public Users(String firstName, String login, String password) {
        FirstName = firstName;
        Login = login;
        Password = password;
    }

    public Users() {

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

}

