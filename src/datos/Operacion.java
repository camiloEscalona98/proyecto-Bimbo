/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 * Operacion contra base de datos  (listar y ejecutar)
 * @author camilo
 *  
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Operacion {

    Conexion conexion = new Conexion();

   /** 
    * Metodo para obtener datos mediante select
    * @param operacion  Instrucion sql de tipo select para obtener datosn 
    * @return ResultSet con datos solicitados de la BD
    */
    public ResultSet Listar(String operacion) {
        try {
            Class.forName(conexion.getDriver()).newInstance();
            Connection cn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPwd());
            PreparedStatement da = cn.prepareStatement(operacion);
            ResultSet tbl = da.executeQuery();
            return tbl;

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }

    }

    /**
     * Metodo para realizar operaciones en la base de datos
     * 
     * @param operacion instruccion sql para realizar contra base de datos
     */
    public void ejecutar(String operacion) {
        try {
            Class.forName(conexion.getDriver()).newInstance();
            Connection cn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPwd());
            PreparedStatement da = cn.prepareStatement(operacion);
            int r = da.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(null, "Se afectaron " + r + "filas");

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Hubo un problema " + e.getMessage());
        }
    }
   

}
