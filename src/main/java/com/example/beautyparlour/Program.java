package com.example.beautyparlour;

import java.sql.Connection;
import java.sql.DriverManager;

public class Program{

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/beauty";
            String username = "root";
            String password = "1379248650";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                System.out.println("Connection to Store DB succesfull!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}