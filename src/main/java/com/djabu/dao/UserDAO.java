package com.djabu.dao;

import com.djabu.model.UserModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.djabu.dao.Conexion.obtenerConexion;


public class UserDAO {


    public List<UserModel> getUsers(){
        List<UserModel> users = new ArrayList<>();
        String sql="SELECT * from users";

        try {
            Connection conn = obtenerConexion();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt("id");
                String identification = rs.getString("identification");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String password = rs.getString("password");

                users.add(new UserModel(id,identification,firstname,lastname,phone,email,password) );
            }
        }catch (SQLException e){
            System.out.println("error: " + e.getMessage());
        }
       
        return users;


    }

    public UserModel login(String email, String password){
        UserModel user = null;
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        try(Connection conn = obtenerConexion();
            PreparedStatement pstm = conn.prepareStatement(sql);) {
            pstm.setString(1, email);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){
                user = new UserModel();
                user.setId(rs.getInt("id"));
                user.setIdentification(rs.getString("identification"));
                user.setFirstname(rs.getString("firstname"));
                user.setLastname(rs.getString("lastname"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                System.out.println(user);
                return user;
            }else {
                return null ;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void insertUser(UserModel user) {
        String sql = "INSERT INTO users (identification,firstname,lastname,phone,email,password) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, user.getIdentification());
            pstmt.setString(2, user.getFirstname());
            pstmt.setString(3, user.getLastname());
            pstmt.setString(4, user.getPhone());
            pstmt.setString(5, user.getEmail());
            pstmt.setString(6, user.getPassword());


            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas > 0) {
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        user.setId(rs.getInt(1));
                    }
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void UpdateUser(int id, String firstname, String lastname) {
        String sql = "UPDATE users SET firstname = ?, lastname = ? WHERE id = ?";

        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, firstname);
            stmt.setString(2, lastname);
            stmt.setInt(3, id);

            int filasAfectadas = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public boolean DeleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";

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
