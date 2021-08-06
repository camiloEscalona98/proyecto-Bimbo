/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Operacion;
import java.awt.Component;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Modelo vendedor 
 * @author camilo
 */
public class Vendedor {

    public Vendedor(int rutVendedor, String nombre) {
        this.rut_vendedor = rutVendedor;
        this.nombre = nombre;
        
    }

    public Vendedor() {
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the contacto
     */
    public int getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(int contacto) {
        this.contacto = contacto;
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

    private int rut_vendedor;
    private String nombre;
    private String apellido;
    private int contacto;
    private Date fecha_registro;
    private String usuario_registro;

    
    /** 
     * metodo de ingreso de datos a la bd
     */
    
    public void agregarDatos() {
        Operacion operacion = new Operacion();
        String sql = "insert into vendedor(rut_vendedor,nombre,apellido,contacto) values('" + this.rut_vendedor + "','" + this.nombre + "','" + this.apellido + "','" + this.contacto + "')";
        operacion.ejecutar(sql);
    }
    
    /**
     * metodo de actualizacion de datos en bd
     */

    public void actualizarDatos() {
        Operacion operacion = new Operacion();
        String sql = "update vendedor set nombre apellido, contacto= '" + this.rut_vendedor + "','" + this.nombre + "','" + this.apellido + "','" + this.contacto + "' where rut_vendedor= '" + this.rut_vendedor + "'  ";
        operacion.ejecutar(sql);
    }
    
    /**
     * metodo de eliminacion de datos en bd
     */

    public void eliminarDatos() {
        Operacion operacion = new Operacion();
        String sql = "delete from vendedor where rut_vendedor='" + this.rut_vendedor + "'";
        operacion.ejecutar(sql);
    }
    
    /**
     * metodo de listar datos desde la BD
     * @return Arraylist, lista de datos de vendedores incorporada en BD
     */
    
    public ArrayList<Vendedor> listarVendedor() {
        ArrayList lista = new ArrayList();
        try {
            Operacion operacion = new Operacion();
            ResultSet tabla = operacion.Listar("select * from vendedor");
            Vendedor vendedor;
            while (tabla.next()) {
                vendedor = new Vendedor();
                vendedor.setRut_vendedor(Integer.parseInt(tabla.getString("rut_vendedor")));
                vendedor.setNombre(tabla.getString("nombre"));
                vendedor.setApellido(tabla.getString("apellido"));
                vendedor.setContacto(Integer.parseInt(tabla.getString("contacto")));
                vendedor.setUsuario_registro(tabla.getString("usuario_registro"));
                lista.add(vendedor);
            }
        } catch (Exception ex) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent, "Se ha producido un error " + ex.getMessage());
        }
        return lista;
    }

}
