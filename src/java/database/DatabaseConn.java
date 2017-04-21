/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConn {
  
    private Connection conn = null;
    private Statement stmt = null;
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/library";

    public DatabaseConn()  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn =(Connection)DriverManager.getConnection(url,user,password);
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }

    public ResultSet selectFun(String select) throws SQLException {
        return stmt.executeQuery(select);
        
    }

    public void dmlFun(String Sql) throws SQLException {
        stmt.executeUpdate(Sql);
    }

    public void closeConn() throws SQLException {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
        }
    }
}
    

