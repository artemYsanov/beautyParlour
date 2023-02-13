package com.example.beautyparlour;

import java.sql.*;

public class DateBase extends Configs {
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?serverTimezone=Europe/Moscow&useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser,dbPass);
        return dbConnection;
    }
    public void signUpUser(Users users) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" + Const.USERS_NAME + "," + Const.USERS_LOGIN + "," + Const.USERS_PASSWOD + ")" + "VALUES(?,?,?)";
        try {
            PreparedStatement prST = getDbConnection().prepareStatement(insert);
            prST.setString(1, users.getFirstName());
            prST.setString(2, users.getLogin());
            prST.setString(3, users.getPassword());

            prST.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ClassCastException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public ResultSet getUser(Users users) {
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " + Const.USERS_LOGIN + "=? AND " + Const.USERS_PASSWOD + "=?";
        try {
            PreparedStatement prST = getDbConnection().prepareStatement(select);
            prST.setString(1, users.getLogin());
            prST.setString(2, users.getPassword());

            resSet = prST.executeQuery();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return resSet;
    }
}


