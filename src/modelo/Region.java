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
public class Region {

    private int id_region;
    private String region;
    private Date fecha_registro;
    private String usuario_registro;

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
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
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
