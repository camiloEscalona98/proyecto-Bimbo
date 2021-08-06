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
public class Utiles {
    
    
    private int id_utiles;
    private int id_vehiculos;
    private String indumentaria;
    private Date fecha_registro;
    private String usuario_registro;

    /**
     * @return the id_utiles
     */
    public int getId_utiles() {
        return id_utiles;
    }

    /**
     * @param id_utiles the id_utiles to set
     */
    public void setId_utiles(int id_utiles) {
        this.id_utiles = id_utiles;
    }

    /**
     * @return the id_vehiculos
     */
    public int getId_vehiculos() {
        return id_vehiculos;
    }

    /**
     * @param id_vehiculos the id_vehiculos to set
     */
    public void setId_vehiculos(int id_vehiculos) {
        this.id_vehiculos = id_vehiculos;
    }

    /**
     * @return the indumentaria
     */
    public String getIndumentaria() {
        return indumentaria;
    }

    /**
     * @param indumentaria the indumentaria to set
     */
    public void setIndumentaria(String indumentaria) {
        this.indumentaria = indumentaria;
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
