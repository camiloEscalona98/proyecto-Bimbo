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
public class Usuario {

    private int id_usuario;
    private int id_rol;
    private String nombre_usuario;
    private String ocntraseña;
    private Date fecha_registro;
    private String usuario_registro;

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

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
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usuario the nombre_usuario to set
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * @return the ocntraseña
     */
    public String getOcntraseña() {
        return ocntraseña;
    }

    /**
     * @param ocntraseña the ocntraseña to set
     */
    public void setOcntraseña(String ocntraseña) {
        this.ocntraseña = ocntraseña;
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

    public void agregarDatos() {
        JOptionPane.showMessageDialog(null, "Agregado correctamente");
    }

    public void actualizarDatos() {
        JOptionPane.showMessageDialog(null, "Actualizado correctamente");
    }

    public void eliminarDatos() {
        JOptionPane.showMessageDialog(null, "Eliminado correctamente");
    }

}
