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
 * modelo de devoluciones de la aplicacion
 * @author camilo
 */
public class Devolucion {

    private int id_devolucion;
    private int id_producto;
    private int rut_cliente;
    private int rut_vendedor;
    private int id_ruta;
    private int id_tipo_devolucion;
    private Date fechaRegistro;
    private String usuarioRegistro;
    private int idDetalle;
    

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }
    /**
     * @return the id_devolucion
     */
    public int getId_devolucion() {
        return id_devolucion;
    }

    /**
     * @param id_devolucion the id_devolucion to set
     */
    public void setId_devolucion(int id_devolucion) {
        this.id_devolucion = id_devolucion;
    }

    /**
     * @return the id_producto
     */
    public int getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * @return the rut_cliente
     */
    public int getRut_cliente() {
        return rut_cliente;
    }

    /**
     * @param rut_cliente the rut_cliente to set
     */
    public void setRut_cliente(int rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    /**
     * @return the rut_vendedor
     */
    public int getRut_vendedor() {
        return rut_vendedor;
    }

    /**
     * @param rut_vendedor the rut_vendedor to set
     */
    public void setRut_vendedor(int rut_vendedor) {
        this.rut_vendedor = rut_vendedor;
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
     * @return the id_tipo_devolucion
     */
    public int getId_tipo_devolucion() {
        return id_tipo_devolucion;
    }

    /**
     * @param id_tipo_devolucion the id_tipo_devolucion to set
     */
    public void setId_tipo_devolucion(int id_tipo_devolucion) {
        this.id_tipo_devolucion = id_tipo_devolucion;
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
     * metodo de agregar devolucion a BD
     */
    public void agregarDatos()
    {
         JOptionPane.showMessageDialog(null, "Agregado correctamente");
    }
    /**
     * metodo de actualizacion de devolucion a BD
     */
    public void actualizarDatos()
    {
         JOptionPane.showMessageDialog(null, "Actualizado correctamente");
    }
    /**
     * metodo de eliminar devolucion de BD
     */
    public void eliminarDatos()
    {
         JOptionPane.showMessageDialog(null, "Eliminado correctamente");
    }
    
  

}
