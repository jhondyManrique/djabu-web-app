package com.djabu.model;

public class UserModel {
    protected int id;
    protected String identification;
    protected String firstname;
    protected String lastname;
    protected String phone;
    protected String email;
    protected String password;

    public UserModel() {
    }

    public UserModel(int id, String identification, String firstname, String lastname, String phone, String email, String password) {
        this.id = id;
        this.identification = identification;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Persona{id=" + id + ", nombre='" + firstname + "', apellido='" + lastname + "'}";
    }


}
