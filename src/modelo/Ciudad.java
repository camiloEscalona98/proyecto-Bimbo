/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import javax.swing.JOptionPane;

public class Ciudad {

    private int id_ciudad;
    private int id_region;
    private String ciudad;
    private String usuarioRegistro;
    private Date fechaRegistro;

    public Ciudad(int idCiudad, String ciudad) {
        this.id_ciudad = idCiudad;
        this.ciudad = ciudad;
    }

    public Ciudad() {
    }

    /**
     * @return the id_ciudad
     */
    public int getId_ciudad() {
        return id_ciudad;
    }

    /**
     * @param id_ciudad the id_ciudad to set
     */
    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
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
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the usuarioRegistro
     */
    public String getUsuarioRegistro() {
        return usuarioRegistro;
    }

    /**
     * @param usuarioRegistro the usuarioRegistro to set
     */
    public void setUsuarioRegistro(String usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void agregarDatos() {
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
    }

    public void actualizarDatos() {
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
    }

    public void eliminarDatos() {
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
    }

}
