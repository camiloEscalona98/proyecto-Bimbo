/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author camilo
 */
public class Rol {

    private int id_rol;
    private String rol;
    private Date fecha_registro;
    private String usuario_registro;

    public Rol(int id_rol, String rol) {
        this.id_rol = id_rol;
        this.rol = rol;
    }
    public Rol(){}

    /**
     * @return the id_rol
     */
    public int getId_rol() {
        return id_rol;
    }

    /**
     * @param id_rol the id_rol to set
     */
    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * @return the fecha_registro
     */
    public Date getFecha_registro() {
        return fecha_registro;
    }

    /**
     * @param fecha_registro the fecha_registro to set
     */
    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    /**
     * @return the usuario_registro
     */
    public String getUsuario_registro() {
        return usuario_registro;
    }

    /**
     * @param usuario_registro the usuario_registro to set
     */
    public void setUsuario_registro(String usuario_registro) {
        this.usuario_registro = usuario_registro;
    }
    
    public void agregarDatos()
    {
         JOptionPane.showMessageDialog(null, "Agregado correctamente");
    }
    public void actualizarDatos()
    {
         JOptionPane.showMessageDialog(null, "Actualizado correctamente");
    }
    public void eliminarDatos()
    {
         JOptionPane.showMessageDialog(null, "Eliminado correctamente");
    }

}
