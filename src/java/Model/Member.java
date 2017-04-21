/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import database.DatabaseConn;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Member {

    private int id;
    private String username;
    private String Gender;
    private String phone;
    private String Email;
    private String Address;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String username, String password) throws SQLException {
        DatabaseConn db = new DatabaseConn();

        String query = "select * from members where username= " + "'" + username + "'" + "  and password = " + "'" + password + "'" + " ";
        ResultSet rs = db.selectFun(query);

        if (rs.next()) {
            return true;
        } else {
            return false;
        }

    }

    public void AddNewMember(String username, String gender, String phone, String email, String address, String password) throws SQLException {
        DatabaseConn db = new DatabaseConn();

        String query = "insert into members (username, Gender, phone, Email, Address, password)"
                + "values('" + username + "','" + gender + "','" + phone + "','" + email + "','" + address + "','" + password + "')";
        db.dmlFun(query);
    }
    
    // get info based on username and password and return object which will has all details 
    public Member getInfo(String username, String password) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        String query = "select * from members where username = '" + username + "' and password = '" + password + "'";
        ResultSet rs = db.selectFun(query);
        Member me = new Member();
        while (rs.next()) {
            me.setId(rs.getInt(1));
            me.setGender(rs.getString("Gender"));
            me.setAddress(rs.getString("Address"));
            me.setUsername(rs.getString("username"));
            me.setPhone(rs.getString("phone"));
            me.setPassword(rs.getString("password"));
            me.setEmail(rs.getString("Email"));

        }
        return me;
    }
     
    public int getMemID(String username) throws SQLException{
         DatabaseConn db = new DatabaseConn();
        String query = "select id  from members where username= '"+username+"'  ";
        ResultSet rs = db.selectFun(query);
        int idd=0;
        while (rs.next()){
            idd=rs.getInt(1);
        }
        return idd;
    }

    public void editProfile(int id ,String username, String password, String gender, String email, String phone, String address) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        
        String query = "update members set "
                + "username ='"+username+ "' , Gender ='" + gender + "', phone = '" +phone+"' , Email ='" + email + "', Address ='" + address + "',  password='" +password+"'  where id ='"+id+"' ";
        db.dmlFun(query);
    }

}
