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
 * modelo de ruta para aplicacion
 * @author camilo
 */
public class Ruta {

    private int id_ruta;
    private int id_ciudad;
    private int rut_vendedor;
    private int id_cliente;

    private Date fecha_registro;
    private String usuario_registro;
    private String dia;

    public Ruta(int idRuta, String dia) {

        this.id_ruta = idRuta;
        this.dia = dia;
    }

    public Ruta() {

    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
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
     * metodo de agregar datos de ruta a BD
     */
    public void agregarDatos() {
        Operacion operacion = new Operacion();
        String sql = "insert into ruta(id_ruta,dia,rut_vendedor) values('" + this.id_ruta + "','" + this.dia + "','" + this.rut_vendedor + "')";

        operacion.ejecutar(sql);
    }
    /**
     * metodo de actualizar datos de ruta en BD
     */
    public void actualizarDatos() {
        JOptionPane.showMessageDialog(null, "Actualizado correctamente");
    }
    /** 
     * metodo de eliminar datos de ruta en BD
     */
    public void eliminarDatos() {
        Operacion operacion = new Operacion();
        String sql = "delete from ruta where id_ruta = '" + this.id_ruta + "'";
        operacion.ejecutar(sql);
    }
    /**
     * metodo de listar ruta con datos de la BD
     * @return  arraylist, lista de datos de la ruta desde la BD
     */
    public ArrayList<Ruta> listarRuta() {
        ArrayList listaRuta = new ArrayList();
        try {
            Operacion operacion = new Operacion();
            String sql = "select * from ruta order by dia, rut_vendedor";
            ResultSet resultadoConsulta = operacion.Listar(sql);
            Ruta ruta;
            while(resultadoConsulta.next()){
                ruta = new Ruta();
                ruta.setId_ruta(Integer.parseInt(resultadoConsulta.getString("id_ruta")));
                ruta.setDia(resultadoConsulta.getString("dia"));
                ruta.setRut_vendedor(Integer.parseInt(resultadoConsulta.getString("rut_vendedor")));
                listaRuta.add(ruta);
            }

        } catch (Exception ex) {
        }
        return listaRuta;

    }
}
