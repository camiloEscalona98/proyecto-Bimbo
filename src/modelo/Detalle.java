/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Operacion;
import javax.swing.JFrame;
import vista.detalle.AgregarDetalle;

/**
 *
 * @author camilo
 */
public class Detalle {

    int id_detalle;
    int id_producto;
    int id_tipo_devolucion;
    int cantidad;
    int valor_total;

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_tipo_devolucion() {
        return id_tipo_devolucion;
    }

    public void setId_tipo_devolucion(int id_tipo_devolucion) {
        this.id_tipo_devolucion = id_tipo_devolucion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }
    
     public void agregarDatos() {
        //Creamos un objeto de la clase operación
        Operacion operacion = new Operacion();
        //Definimos instrucción a ejecutar
        String sql = "insert into detalle(id_producto, id_tipo_devolucion, cantidad, valor_total) values('"+ this.id_producto + "','"+ this.id_tipo_devolucion+"','"+this.cantidad+"','"+this.valor_total+"')";
        //Invocar el método para agregar el dato
        operacion.ejecutar(sql);
   
        
    }
    

}
