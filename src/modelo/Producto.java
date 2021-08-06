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
 *  modelo de producto de la aplicacion
 * @author camilo
 */
public class Producto {

    private int id_producto;
    private int id_marca;
    private String producto;
    private int dia_vencimiento;
    private int mes_vencimiento;
    private int año_vencimiento;
    private Date fecha_registro;
    private String usuario_registro;

    public Producto(int idProducto, String producto) {
        this.id_producto = idProducto;
        this.producto = producto;
    }

    public Producto() {
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
     * @return the id_marca
     */
    public int getId_marca() {
        return id_marca;
    }

    /**
     * @param id_marca the id_marca to set
     */
    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the dia_vencimiento
     */
    public int getDia_vencimiento() {
        return dia_vencimiento;
    }

    /**
     * @param dia_vencimiento the dia_vencimiento to set
     */
    public void setDia_vencimiento(int dia_vencimiento) {
        this.dia_vencimiento = dia_vencimiento;
    }

    /**
     * @return the mes_vencimiento
     */
    public int getMes_vencimiento() {
        return mes_vencimiento;
    }

    /**
     * @param mes_vencimiento the mes_vencimiento to set
     */
    public void setMes_vencimiento(int mes_vencimiento) {
        this.mes_vencimiento = mes_vencimiento;
    }

    /**
     * @return the año_vencimiento
     */
    public int getAño_vencimiento() {
        return año_vencimiento;
    }

    /**
     * @param año_vencimiento the año_vencimiento to set
     */
    public void setAño_vencimiento(int año_vencimiento) {
        this.año_vencimiento = año_vencimiento;
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
    /**
     * metodo a agregar nuevo producto a BD
     */
    public void agregarDatos() {
        Operacion operacion = new Operacion();
        String sql = "insert into producto(producto, id_marca) values('" + this.producto + "','" + this.id_marca + "')";
        operacion.ejecutar(sql);
    }
    /**
     * metodo de actualziar producto en BD
     */
    public void actualizarDatos() {
        Operacion operacion = new Operacion();
        String sql = "update producto set producto= '" + this.producto + "' where id_producto= '" + this.id_producto + "'";
        operacion.ejecutar(sql);
    }
    /**
     * metodo de eliminar producto de la BD
     */
    public void eliminarDatos() {
        Operacion operacion = new Operacion();
        String sql = "delete from producto where id_producto = '" + this.id_producto + "'";
        operacion.ejecutar(sql);

    }
    /**
     * metodo de listar productos
     * @return Arraylis, lista de productos encontrados en BD
     */
    public ArrayList<Producto> listarProducto() {
        ArrayList listarProducto = new ArrayList();
        try {
            Operacion operacion = new Operacion();
            String sql = "select * from producto order by producto ";
            ResultSet rs = operacion.Listar(sql);
            Producto producto;
            while (rs.next()) {
                producto = new Producto();
                producto.setId_producto(Integer.parseInt(rs.getString("id_producto")));
                producto.setProducto(rs.getString("producto"));
                producto.setId_marca(Integer.parseInt(rs.getString("id_marca")));
                listarProducto.add(producto);
            }

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al consultar datos: " + ex.getMessage());
        }
        return listarProducto;
    }
}
