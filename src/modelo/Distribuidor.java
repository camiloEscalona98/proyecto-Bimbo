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
public class Distribuidor {
    
    
    private int id_distribuidor;
    private int id_region;
    private int id_ruta;
    private int id_utiles;
    private String nombre;
    private Date fecha_registro;
    private String usuario_registro; 

    /**
     * @return the id_distribuidor
     */
    public int getId_distribuidor() {
        return id_distribuidor;
    }

    /**
     * @param id_distribuidor the id_distribuidor to set
     */
    public void setId_distribuidor(int id_distribuidor) {
        this.id_distribuidor = id_distribuidor;
    }

    /**
     * @return the id_region
     */
    public int getId_region() {
        return id_region;
    }

    /**
     * @param id_region the id_region to set
     */
    public void setId_region(int id_region) {
        this.id_region = id_region;
    }

    /**
     * @return the id_ruta
     */
    public int getId_ruta() {
        return id_ruta;
    }

    /**
     * @param id_ruta the id_ruta to set
     */
    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
