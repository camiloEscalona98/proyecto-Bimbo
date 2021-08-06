/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author camilo
 */
public class Vehiiculo {

    private int id_vehiculo;
    private String marca;
    private String modelo;
    private int año;
    private String patente;
    private Date fecha_registo;
    private String usuario_registro;

    /**
     * @return the id_vehiculo
     */
    public int getId_vehiculo() {
        return id_vehiculo;
    }

    /**
     * @param id_vehiculo the id_vehiculo to set
     */
    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the fecha_registo
     */
    public Date getFecha_registo() {
        return fecha_registo;
    }

    /**
     * @param fecha_registo the fecha_registo to set
     */
    public void setFecha_registo(Date fecha_registo) {
        this.fecha_registo = fecha_registo;
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

}
