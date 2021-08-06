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
public class Marca {

    private int id_marca;
    private String marca;
    private Date fecha_registro;
    private String usuario_registro;

    public Marca(int idMarca, String marca) {
        this.id_marca = idMarca;
        this.marca = marca;
    }

    public Marca() {
    }

    /**
     * @return the id_marca
     */
    public int getId_marca() {
        return id_marca;
    }

    /**
     * @param id_marca the id_marca to set
     */
    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
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
