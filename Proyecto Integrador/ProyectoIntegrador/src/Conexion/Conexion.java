package Conexion;

import java.sql.*;

public class Conexion {
    
    public  Connection connect() {  
        Connection conn = null;  
        try {  
            Class.forName("org.sqlite.JDBC");            
            String url = "jdbc:sqlite:F:\\2020-2\\Programacion Orientada a Objetos\\ProyectoIntegradorII\\Proyecto Integrador\\ProyectoIntegrador.db";
            conn = DriverManager.getConnection(url);  
            System.out.println(conn);  
            System.out.println("Connection to SQLite has been established.");  
            
        } catch (SQLException | ClassNotFoundException e) {  
            System.out.println("capturando error: "+e.getMessage());  
        }  
        return conn;
    }
    
}
