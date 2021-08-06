/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 * Conexion con base de datos en servidor mariaDB utilizando driver jdbc
 * @author camilo
 */
public class Conexion {

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://192.168.170.3:3306/Bimbo";
    private String user = "dba";
    private String pwd = "administrador";

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
