/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_Sql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 80157
 */
public class ConexionBD {

    public static String url = "jdbc:mysql://localhost/login_bd";
    public static String usuario = "Corona";
    public static String contraseña = "1234";
    public static String clase = "com.mysql.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion Establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;

    }
}
