/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Operacion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *  modelo de cliente de la aplicacion
 * @author camilo
 */
public class Cliente {

    private int id_ruta;
    private String nombre;
    private String direccion;
    private Date fechaRegistro;
    private String usuarioRegistro;
    private int rut_cliente;
    private int id_giro;
    int id_ciudad;

    public Cliente(int idCliente, String nombre) {
        this.rut_cliente = idCliente;
        this.nombre = nombre;
    }

    public Cliente() {
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
     * metodo de agregar un nuevo cliente a BD
     */
    public void agregarDatos() {
        Operacion operacion = new Operacion();
        String sql = "insert into cliente(rut_cliente, nombre, direccion, id_ciudad, id_ruta, id_giro) values('" + this.rut_cliente + "','" + this.nombre + "','" + this.direccion + "','" + this.id_ciudad + "','" + this.id_ruta + "','" + this.id_giro + "') ";
        operacion.ejecutar(sql);
    }
    /**
     * metodo de actualizar cliente en BD
     */
    public void actualizarDatos() {
        JOptionPane.showMessageDialog(null, "Actualizado correctamente");
    }
    /**
     * metodo de eliminar cliente en BD
     */
    public void eliminarDatos() {
        Operacion operacion = new Operacion();
        String sql = "delete from cliente where rut_cliente = '" + this.rut_cliente + "'";
        operacion.ejecutar(sql);
    }
   /**
    * metodo de listar un cliente en BD
    * @return ArrayList, lista de clientes existentes en BD
    */
    public ArrayList<Cliente> listarCliente() {
        ArrayList listaCliente = new ArrayList();
        try {

            Operacion operacion = new Operacion();
            String sql = "select * from cliente order by nombre";
            ResultSet rs = operacion.Listar(sql);
            Cliente cliente;
            while (rs.next()) {

                cliente = new Cliente();
                cliente.setRut_cliente(Integer.parseInt(rs.getString("rut_cliente")));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setId_giro(Integer.parseInt(rs.getString("id_giro")));
                cliente.setId_ruta(Integer.parseInt(rs.getString("id_ruta")));
                cliente.setId_ruta(Integer.parseInt(rs.getString("id_ruta")));
                listaCliente.add(cliente);
            }

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al consultar datos: " + ex.getMessage());
        }
        return listaCliente;

    }

}
