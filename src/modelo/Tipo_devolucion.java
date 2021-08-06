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
public class Tipo_devolucion {

    private int id_ripo_devolucion;
    private String tipo_devolucion;
    private Date fecha_registro;
    private String usuario_registro;

    public Tipo_devolucion(int idTipo, String tipo) {
        this.id_ripo_devolucion = idTipo;
        this.tipo_devolucion = tipo;
    }

    public Tipo_devolucion() {
    }

    /**
     * @return the id_ripo_devolucion
     */
    public int getId_ripo_devolucion() {
        return id_ripo_devolucion;
    }

    /**
     * @param id_ripo_devolucion the id_ripo_devolucion to set
     */
    public void setId_ripo_devolucion(int id_ripo_devolucion) {
        this.id_ripo_devolucion = id_ripo_devolucion;
    }

    /**
     * @return the tipo_devolucion
     */
    public String getTipo_devolucion() {
        return tipo_devolucion;
    }

    /**
     * @param tipo_devolucion the tipo_devolucion to set
     */
    public void setTipo_devolucion(String tipo_devolucion) {
        this.tipo_devolucion = tipo_devolucion;
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
