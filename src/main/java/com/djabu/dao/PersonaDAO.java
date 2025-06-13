package com.djabu.dao;

import com.djabu.model.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.djabu.dao.Conexion.obtenerConexion;


public class PersonaDAO {


    public List<Persona> getPersonas(){
        List<Persona> personas = new ArrayList<>();
        String sql="SELECT * from personas";

        try {
            Connection conn = obtenerConexion();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt("id_persona");
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String password = rs.getString("password");

                personas.add(new Persona(id,cedula,nombre,apellido,telefono,correo,password) );
            }
        }catch (SQLException e){
            System.out.println("error: " + e.getMessage());
        }
       
        return personas;


    }

    public Persona login(String username, String password){
        Persona modelPersona = null;
        String sql = "SELECT * FROM personas WHERE cedula = ? AND password = ?";
        try(Connection conn = obtenerConexion();
            PreparedStatement pstm = conn.prepareStatement(sql);) {
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


    public void insertPersona(Persona persona) {
        String sql = "INSERT INTO personas (cedula,nombre,apellido,telefono,correo,contraseña) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, persona.getCedula());
            pstmt.setString(2, persona.getNombre());
            pstmt.setString(3, persona.getApellido());
            pstmt.setString(4, persona.getTelefono());
            pstmt.setString(5, persona.getCorreo());
            pstmt.setString(6, persona.getPassword());


            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas > 0) {
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        persona.setId(rs.getInt(1));
                    }
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void actualizarPersona(int id, String nombre, String apellido) {
        String sql = "UPDATE personas SET nombre = ?, apellido = ? WHERE id_persona = ?";

        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setInt(3, id);

            int filasAfectadas = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public boolean eliminarPersona(int id) {
        String sql = "DELETE FROM personas WHERE id_persona = ?";

        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
