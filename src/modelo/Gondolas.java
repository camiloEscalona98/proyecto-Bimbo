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
public class Gondolas {

    private int id_gondolas;
    private int id_cliente;
    private int numero_gondolas;
    private Date fecha_registro;
    private String usuario_registro;

    /**
     * @return the id_gondolas
     */
    public int getId_gondolas() {
        return id_gondolas;
    }

    /**
     * @param id_gondolas the id_gondolas to set
     */
    public void setId_gondolas(int id_gondolas) {
        this.id_gondolas = id_gondolas;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the numero_gondolas
     */
    public int getNumero_gondolas() {
        return numero_gondolas;
    }

    /**
     * @param numero_gondolas the numero_gondolas to set
     */
    public void setNumero_gondolas(int numero_gondolas) {
        this.numero_gondolas = numero_gondolas;
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
