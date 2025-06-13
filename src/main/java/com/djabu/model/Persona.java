package com.djabu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.djabu.dao.Conexion.obtenerConexion;

public class Persona {
    protected int id;
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String correo;
    protected String password;

    public Persona() {
    }

    public Persona(int id, String cedula, String nombre, String apellido, String telefono, String correo, String password) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {return password;}

    public void setPassword(String password){this.password = password;}

    @Override
    public String toString() {
        return "Persona{id=" + id + ", nombre='" + nombre + "', apellido='" + apellido + "'}";
    }

    public Persona login(String username, String password){
        Persona modelPersona = null;
        try {
            String sql = "SELECT * FROM personas WHERE cedula = ? AND password = ?";
            Connection conn = obtenerConexion();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){
                modelPersona = new Persona();
                modelPersona.setId(rs.getInt("id_persona"));
                modelPersona.setCedula(rs.getString("cedula"));
                modelPersona.setNombre(rs.getString("nombre"));
                modelPersona.setApellido(rs.getString("apellido"));
                modelPersona.setTelefono(rs.getString("telefono"));
                modelPersona.setCorreo(rs.getString("apellido"));
                modelPersona.setCorreo(rs.getString("correo"));
                modelPersona.setPassword(rs.getString("password"));
                return modelPersona;
            }else {
                return null ;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
