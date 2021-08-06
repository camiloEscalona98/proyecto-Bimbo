/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import datos.Operacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Logger;
import modelo.Ciudad;
import modelo.Cliente;
import modelo.Giro;
import modelo.Marca;
import modelo.Producto;
import modelo.Rol;
import modelo.Ruta;
import modelo.Tipo_devolucion;
import modelo.Vendedor;

/**
 * clase para la creacion de HashMap sobre los distintos modelos para utilizar en los ComboBox
 * @author camilo
 */
public class ListaGenerica {

    //ROL
    /**
     * metodo para crear HashMAp de modelo Rol
     * @return  Hashmap, valores de rol desde la BD
     */
    public HashMap<String, Integer> generarValoresRol() {
        HashMap<String, Integer> mapRol = new HashMap<String, Integer>();
        Operacion operacion = new Operacion();
        String sql = "select id_rol, rol from rol";
        ResultSet resulSet = operacion.Listar(sql);
        try {
            Rol rol;
            while (resulSet.next()) {
                rol = new Rol(resulSet.getInt(1), resulSet.getString(2));
                mapRol.put(rol.getRol(), rol.getId_rol());
            }
        } catch (SQLException ex) {
            Logger.getLogger(" Error al incorporar datos en HashMap " + ex.getMessage());
        }
        return mapRol;
    }

    //Giro
    /**
     * metodo para crear HashMAp de modelo Giro
     * @return  Hashmap, valores de giro desde la BD
     */
    public HashMap<String, Integer> generarValoresGiro() {
        HashMap<String, Integer> mapGiro = new HashMap<String, Integer>();
        Operacion operacion = new Operacion();
        String sql = "select id_giro, giro from giro";
        ResultSet resulSet = operacion.Listar(sql);
        try {
            Giro giro;
            while (resulSet.next()) {
                giro = new Giro(resulSet.getInt(1), resulSet.getString(2));
                mapGiro.put(giro.getGiro(), giro.getId_giro());
            }
        } catch (SQLException ex) {
            Logger.getLogger(" Error al incorporar datos en HashMap " + ex.getMessage());
        }
        return mapGiro;
    }

    //RUTA
    /**
     * metodo para crear HashMAp de modelo Ruta
     * @return  Hashmap, valores de ruta desde la BD
     */
    public HashMap<String, Integer> generarValoresRuta() {
        HashMap<String, Integer> mapRuta = new HashMap<String, Integer>();
        Operacion operacion = new Operacion();
        String sql = "select id_ruta, dia from ruta";
        ResultSet resulSet = operacion.Listar(sql);
        try {
            Ruta ruta;
            while (resulSet.next()) {
                ruta = new Ruta(resulSet.getInt(1), resulSet.getString(2));
                mapRuta.put(ruta.getDia(), ruta.getId_ruta());
            }
        } catch (SQLException ex) {
            Logger.getLogger(" Error al incorporar datos en HashMap " + ex.getMessage());
        }
        return mapRuta;
    }

    //CIUDAD
    /**
     * metodo para crear HashMAp de modelo Ciudad
     * @return  Hashmap, valores de ciudaddesde la BD
     */
    public HashMap<String, Integer> generarValoresCiudad() {
        HashMap<String, Integer> mapCiudad = new HashMap<String, Integer>();
        Operacion operacion = new Operacion();
        String sql = "select id_ciudad, ciudad from ciudad";
        ResultSet resulSet = operacion.Listar(sql);
        try {
            Ciudad ciudad;
            while (resulSet.next()) {
                ciudad = new Ciudad(resulSet.getInt(1), resulSet.getString(2));
                mapCiudad.put(ciudad.getCiudad(), ciudad.getId_ciudad());
            }
        } catch (SQLException ex) {
            Logger.getLogger(" Error al incorporar datos en HashMap " + ex.getMessage());
        }
        return mapCiudad;

    }

    //Marca
    /**
     * metodo para crear HashMAp de modelo Marca
     * @return  Hashmap, valores de marca desde la BD
     */
    public HashMap<String, Integer> generarValoresMarca() {
        HashMap<String, Integer> mapMarca = new HashMap<String, Integer>();
        Operacion operacion = new Operacion();
        String sql = "select id_marca, marca from marca";
        ResultSet resulSet = operacion.Listar(sql);
        try {
            Marca marca;
            while (resulSet.next()) {
                marca = new Marca(resulSet.getInt(1), resulSet.getString(2));
                mapMarca.put(marca.getMarca(), marca.getId_marca());
            }
        } catch (SQLException ex) {
            Logger.getLogger(" Error al incorporar datos en HashMap " + ex.getMessage());
        }
        return mapMarca;

    }

    //Cliente 
    /**
     * metodo para crear HashMAp de modelo Cliente
     * @return  Hashmap, valores de cliente desde la BD
     */
    public HashMap<String, Integer> generarValoresCliente() {
        HashMap<String, Integer> mapCliente = new HashMap<String, Integer>();
        Operacion operacion = new Operacion();
        String sql = "select rut_cliente, nombre from cliente";
        ResultSet resulSet = operacion.Listar(sql);
        try {
            Cliente cliente;
            while (resulSet.next()) {
                cliente = new Cliente(resulSet.getInt(1), resulSet.getString(2));
                mapCliente.put(cliente.getNombre(), cliente.getRut_cliente());
            }
        } catch (SQLException ex) {
            Logger.getLogger(" Error al incorporar datos en HashMap " + ex.getMessage());
        }
        return mapCliente;

    }

    //Producto
    /**
     * metodo para crear HashMAp de modelo Producto
     * @return  Hashmap, valores de producto desde la BD
     */
    public HashMap<String, Integer> generarValoresProducto() {
        HashMap<String, Integer> mapProducto = new HashMap<String, Integer>();
        Operacion operacion = new Operacion();
        String sql = "select id_producto, producto from producto";
        ResultSet resulSet = operacion.Listar(sql);
        try {
            Producto producto;
            while (resulSet.next()) {
                producto = new Producto(resulSet.getInt(1), resulSet.getString(2));
                mapProducto.put(producto.getProducto(), producto.getId_producto());
            }
        } catch (SQLException ex) {
            Logger.getLogger(" Error al incorporar datos en HashMap " + ex.getMessage());
        }
        return mapProducto;

    }

    //Vendedor 
    /**
     * metodo para crear HashMAp de modelo Vendedor
     * @return  Hashmap, valores de vendedor desde la BD
     */
    public HashMap<String, Integer> generarValoresVendedor() {
        HashMap<String, Integer> mapVendedor = new HashMap<String, Integer>();
        Operacion operacion = new Operacion();
        String sql = "select rut_vendedor, nombre  from vendedor";
        ResultSet resulSet = operacion.Listar(sql);
        try {
            Vendedor vendedor;
            while (resulSet.next()) {
                vendedor = new Vendedor(resulSet.getInt(1), resulSet.getString(2));
                mapVendedor.put(vendedor.getNombre(), vendedor.getRut_vendedor());
            }
        } catch (SQLException ex) {
            Logger.getLogger(" Error al incorporar datos en HashMap " + ex.getMessage());
        }
        return mapVendedor;

    }
    //tipoDevolucion
    /**
     * metodo para crear HashMAp de modelo TipoDEvolucion
     * @return  Hashmap, valores de tipoDevolucion desde la BD
     */
     public HashMap<String, Integer> generarValoresTipoDevolucion() {
        HashMap<String, Integer> mapTipoDevolucion = new HashMap<String, Integer>();
        Operacion operacion = new Operacion();
        String sql = "select id_tipo_devolucion, tipo_devolucion from tipo_devolucion";
        ResultSet resulSet = operacion.Listar(sql);
        try {
            Tipo_devolucion tipo_devolucion;
            while (resulSet.next()) {
                tipo_devolucion = new Tipo_devolucion(resulSet.getInt(1), resulSet.getString(2));
                mapTipoDevolucion.put(tipo_devolucion.getTipo_devolucion(), tipo_devolucion.getId_ripo_devolucion());
            }
        } catch (SQLException ex) {
            Logger.getLogger(" Error al incorporar datos en HashMap " + ex.getMessage());
        }
        return mapTipoDevolucion;

    }
     
    
    

}
