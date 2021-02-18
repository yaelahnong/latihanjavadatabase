/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekolah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MARINO IMOLA
 */
public class Konfig {
    
    private static Connection MySQLConfig;
    
    public static Connection configDB() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/latihanjavadatabase";
        String user = "root";
        String pass = "";
            
        try {
            //Registering Driver MySQL
            Class.forName("com.mysql.jdbc.Driver");
            MySQLConfig = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi ke Database berhasil "+url);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return MySQLConfig;
            
    }
    
}
