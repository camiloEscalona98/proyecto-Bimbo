/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Operacion;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author camilo
 */
public class Giro {

    private int id_giro;
    private String giro;
    private Date fecha_registro;
    private String usuario_registro;

    public Giro(int idGiro, String giro) {
        this.id_giro = idGiro;
        this.giro = giro;
    }
    public Giro(){
        
    }

    /**
     * @return the id_giro
     */
    public int getId_giro() {
        return id_giro;
    }

    /**
     * @param id_giro the id_giro to set
     */
    public void setId_giro(int id_giro) {
        this.id_giro = id_giro;
    }

    /**
     * @return the giro
     */
    public String getGiro() {
        return giro;
    }

    /**
     * @param giro the giro to set
     */
    public void setGiro(String giro) {
        this.giro = giro;
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
        Operacion operacion = new Operacion();
        String sql = "insert into giro(giro) values('" + this.giro + "')";
        operacion.ejecutar(sql);
    }

    public void actualizarDatos() {
        JOptionPane.showMessageDialog(null, "Actualizado correctamente");
    }

    public void eliminarDatos() {
        JOptionPane.showMessageDialog(null, "Eliminado correctamente");
    }

}
