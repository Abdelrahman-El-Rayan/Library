package Model;

import database.DatabaseConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Admin {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // login service 
    public boolean login(String username, String password) throws SQLException {
        DatabaseConn db = new DatabaseConn();

        String query = "select * from admin where username= " + "'" + username + "'" + "  and password = " + "'" + password + "'" + " ";
        ResultSet rs = db.selectFun(query);

        if (rs.next()) {
            return true;
        } else {
            return false;
        }

    }

    // get id for any component (category , publisher ,auther ) based on table name of table and subcomponet name  
    //to use this id when add new book 
    public int getIdFromTable(String table, String name) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        String query = "select id from " + table + " where name =" + "'" + name + "'" + "";
        ResultSet rs = db.selectFun(query);
        int id = 0;
        while (rs.next()) {
            id = rs.getInt(1);

        }
        return id;
    }

    // get name from specific table 
    public ArrayList getName(String table) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        ArrayList arr = new ArrayList();
        String query = "select name from " + table + "";
        ResultSet rs = db.selectFun(query);
        while (rs.next()) {
            String name = rs.getString("name");
            arr.add(name);
        }
        return arr;

    }

    public void addNewBook(String title, int edtion, int pageNo, int publisherId,
            int autherId, int categoryId, int available) throws SQLException {

        DatabaseConn db = new DatabaseConn();

        String query = "insert into book (title, edition_No, page_no, publisher_id, auther_ID, category_id, availability)"
                + "values('" + title + "','" + edtion + "','" + pageNo + "','" + publisherId + "','" + autherId + "','" + categoryId + "','" + available + "')";

        db.dmlFun(query);
    }

    public String getLevel(String username, String password) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        String query = "select * from admin where username = '"+username+"' and password='"+password+"' ";
        ResultSet rs = db.selectFun(query);
        String level = "";

        while (rs.next()) {
            level = rs.getString("level");

        }
        return level;
    }

    public void addNewAdmin(String username, String password, String level) throws SQLException {

        DatabaseConn db = new DatabaseConn();

        String query = "insert into admin (username, password, level)"
                + "values('" + username + "','" + password + "','" + level + "')";

        db.dmlFun(query);
    }

    public void changePassword(String password, String username) throws SQLException {

        DatabaseConn db = new DatabaseConn();

        String query = "update admin set password ='" + password + "' where username= '"+username+"' ";

        db.dmlFun(query);
    }
    
     public void editBook(int bookID , String title ,int pageNo, int edition ,int autherId ,int publisherId ,int categoryId , int avail) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        String query = "update book "
                + "set title='"+title+"' ,edition_No="+edition+" , page_no="+pageNo+", publisher_id="+publisherId+","
                + "auther_ID ="+autherId+", category_id="+categoryId+", availability="+avail+"  where book_ID="+bookID+" ";

        db.dmlFun(query);
        db.closeConn();
    }

}
