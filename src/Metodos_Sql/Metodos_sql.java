/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_Sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 80157
 */
public class Metodos_sql {
    
    public static ConexionBD conexion = new ConexionBD();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static int resultado_numero = 0;
     
    public int guardar(String nombre, String apellidos, String puesto, String correo, String contraseña){
    int resultado =0;
    Connection conexion = null;
    
    String sentencia_guardar =("INSERT INTO usuarios(nombre, apellidos, puesto, correo, contraseña) VALUES (?,?,?,?,?)");
    
    try{
    conexion = ConexionBD.conectar();
    sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
    sentencia_preparada.setString(1, nombre);
    sentencia_preparada.setString(2, apellidos);
    sentencia_preparada.setString(3, puesto);
    sentencia_preparada.setString(4, correo);
    sentencia_preparada.setString(5, contraseña);
    resultado = sentencia_preparada.executeUpdate();
    sentencia_preparada.close();
  
    conexion.close();
    }catch (Exception e){
        
        System.out.println(e);
    }
    
    
    return resultado;
    }
    
   public static String buscarNombre(String correo){
   String busqueda_nombre =null;
   Connection conexion =null;
   try{
   conexion = ConexionBD.conectar();
   String sentencia_buscar=("SELECT nombre,apellidos FROM usuarios WHERE correo = '"+ correo + "'");
   sentencia_preparada= conexion.prepareStatement(sentencia_buscar);
   resultado=sentencia_preparada.executeQuery();
   if(resultado.next()){
   String nombre = resultado.getString("nombre");
   String apellidos = resultado.getString("apellidos");
   busqueda_nombre = (nombre +" "+ apellidos);
   }
   conexion.close();
   }catch (Exception e){
       System.out.println(e);
   }
   return busqueda_nombre;
   } 
    
   public static String buscarUsuarioRegistrado(String correo, String contraseña){
   String busqueda_usuario=null;
   Connection conexion = null;
   
   try{
   conexion = ConexionBD.conectar();
   String sentencia_buscar_usuario = ("SELECT nombre, correo, contraseña FROM usuarios WHERE correo = '"+correo+"'&& contraseña = '"+ contraseña+"'");
   sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
   resultado = sentencia_preparada.executeQuery();
   if (resultado.next()){
   busqueda_usuario = "usuario encontrado";
   }else{
       busqueda_usuario = "usuario no encontrado";
   }
   conexion.close();
   } catch (Exception e){
       System.out.println(e);
   }
   return busqueda_usuario;
   }
}
