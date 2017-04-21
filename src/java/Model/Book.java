/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import database.DatabaseConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CASPER
 */
public class Book {

    private int bookId;
    private String title;
    private int pageNo;
    private int editionNo;
    private int publisherId;
    private int autherId;
    private int categoryId;
    private int availability;
    private int memberId;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    private String startDate;
    private String returnDate;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getEditionNo() {
        return editionNo;
    }

    public void setEditionNo(int editionNo) {
        this.editionNo = editionNo;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public int getAutherId() {
        return autherId;
    }

    public void setAutherId(int autherId) {
        this.autherId = autherId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public ArrayList getBooks() throws SQLException {
        DatabaseConn db = new DatabaseConn();
        ArrayList<Book> arr = new ArrayList<Book>();

        String query = "select * from book";

        ResultSet rs = db.selectFun(query);
        while (rs.next()) {
            Book bok = new Book();
            bok.setBookId(rs.getInt(1));
            bok.setTitle(rs.getString("title"));
            bok.setEditionNo(rs.getInt("edition_No"));
            bok.setPageNo(rs.getInt("page_no"));
            bok.setPublisherId(rs.getInt("publisher_id"));
            bok.setAutherId(rs.getInt("auther_ID"));
            bok.setCategoryId(rs.getInt("category_id"));
            bok.setAvailability(rs.getInt("availability"));

            arr.add(bok);

        }
        return arr;
    }

    public String getNames(String table, int id) throws SQLException {
        DatabaseConn db = new DatabaseConn();

        String query = "select name from " + table + " where id =" + id + "";
        ResultSet rs = db.selectFun(query);
        String name = null;
        while (rs.next()) {
            name = rs.getString("name");
        }
        return name;
    }

    /////////////////   edit move it to admin class 
    public void addNewCategory(String name) throws SQLException {

        DatabaseConn db = new DatabaseConn();

        String query = "insert into category values('" + name + "') ";

        db.dmlFun(query);
    }

    public void addNewPublisher(String name, String address, int phone, String email) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        String query = "insert into publisher values('" + name + "' ,'" + address + "','" + phone + "','" + email + "') ";
        db.dmlFun(query);
    }

    public void addNewAuther(String name, String address) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        String query = "insert into auther values('" + name + "' ,'" + address + "') ";
        db.dmlFun(query);
    }

    public void addNewBorrowers(int memID, int bookId, String from, String to) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        String query = "insert into borrowers values('" + bookId + "' ,'" + memID + "','" + from + "','" + to + "') ";
        db.dmlFun(query);
    }

    public void removeBorrower(int bookId, int memberID) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        String query = "delete from borrowers where bookId=" + bookId + " and  memberId=" + memberID + " ";
        db.dmlFun(query);
    }

    public void changeStatusOfBook(int bookId, int status) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        String query = "update book set availability =" + status + " where book_ID=" + bookId + "";
        db.dmlFun(query);
    }

    public ArrayList searchBook(String word, String criteria) throws SQLException {

        DatabaseConn db = new DatabaseConn();
        ArrayList<Book> arr = new ArrayList <Book>();
         
      if (criteria.equals("category")) {
        String query = "select book.`book_ID` , book.title ,book.`edition_No` ,book.page_no ,book.publisher_id,\n"
                + "book.`auther_ID` ,book.category_id, book.availability from book ,category  \n"
                + "where book.category_id =category.id \n"
                + "and category.`Name` = '"+word+"' ";
        ResultSet rs = db.selectFun(query);
        while (rs.next()) {
            Book boook = new Book();
                boook.setBookId(rs.getInt(1));
                boook.setTitle(rs.getString(2));
                boook.setPageNo(rs.getInt(4));
                boook.setEditionNo(rs.getInt(3));
                boook.setPublisherId(rs.getInt(5));
                boook.setAutherId(rs.getInt(6));
                boook.setCategoryId(rs.getInt(7));
                boook.setAvailability(rs.getInt(8));
                arr.add(boook);
            
        }
      }
      else if (criteria.equals("booktitle")) {
            String query2 = "select book.book_ID , book.title , book.edition_No ,book.page_no , book.publisher_id  "
                    + " ,book.auther_ID,book.category_id ,book.availability from book where  book.title ='"+word+"' ";
            ResultSet rs = db.selectFun(query2);
            while (rs.next()) {
                Book bk = new Book();
                bk.setBookId(rs.getInt(1));
                bk.setTitle(rs.getString("title"));
                bk.setPageNo(rs.getInt("page_no"));
                bk.setEditionNo(rs.getInt("edition_No"));
                bk.setPublisherId(rs.getInt("publisher_id"));
                bk.setAutherId(rs.getInt("auther_ID"));
                bk.setCategoryId(rs.getInt("category_id"));
                bk.setAvailability(rs.getInt("availability"));
                arr.add(bk);
            }

        }
      else if (criteria.equals("auther")) {
            String query2 = " select book.book_ID , book.title , book.edition_No , book.page_no , book.publisher_id  "
                    + " , book.auther_ID, book.category_id , book.availability"
                    + " from book , auther where book.auther_ID = auther.id and auther.name = '"+word+"' ";
            ResultSet rs = db.selectFun(query2);
            while (rs.next()) {
                Book bk = new Book();
                bk.setBookId(rs.getInt(1));
                bk.setTitle(rs.getString("title"));
                bk.setPageNo(rs.getInt("page_no"));
                bk.setEditionNo(rs.getInt("edition_No"));
                bk.setPublisherId(rs.getInt("publisher_id"));
                bk.setAutherId(rs.getInt("auther_ID"));
                bk.setCategoryId(rs.getInt("category_id"));
                bk.setAvailability(rs.getInt("availability"));
                arr.add(bk);
            }

        } else  {
            String query2 = "select book.book_ID , book.title , book.edition_No ,book.page_no ,book.publisher_id  "
                    + " , book.auther_ID, book.category_id ,book.availability"
                    + " from book , publisher where book.publisher_id = publisher.id and  publisher.name = '"+word+"' ";
            ResultSet rs = db.selectFun(query2);
            while (rs.next()) {
                Book bk = new Book();
                bk.setBookId(rs.getInt(1));
                bk.setTitle(rs.getString("title"));
                bk.setPageNo(rs.getInt("page_no"));
                bk.setEditionNo(rs.getInt("edition_No"));
                bk.setPublisherId(rs.getInt("publisher_id"));
                bk.setAutherId(rs.getInt("auther_ID"));
                bk.setCategoryId(rs.getInt("category_id"));
                bk.setAvailability(rs.getInt("availability"));
                arr.add(bk);
            }

        }
        db.closeConn();
        return arr;

    }

     // get vavialable books to be borrowed   0 available  1 unvailable      edit edit 
    public Book getBookInfo(int bookId) throws SQLException {
        DatabaseConn db = new DatabaseConn();

        String query = "select * from book where book_ID = " + bookId + "";
        ResultSet rs = db.selectFun(query);
        Book bk = new Book();
        while (rs.next()) {

            bk.setBookId(rs.getInt(1));
            bk.setTitle(rs.getString("title"));
            bk.setPageNo(rs.getInt("page_no"));
            bk.setEditionNo(rs.getInt("edition_No"));
            bk.setPublisherId(rs.getInt("publisher_id"));
            bk.setAutherId(rs.getInt("auther_ID"));
            bk.setCategoryId(rs.getInt("category_id"));
            bk.setAvailability(rs.getInt("availability"));
        }
        db.closeConn();
        return bk;
    }

    public String getBookTitle(int id) throws SQLException {
        DatabaseConn db = new DatabaseConn();

        String query = "select title from book where book_ID =" + id + " ";
        ResultSet rs = db.selectFun(query);
        String name = null;
        while (rs.next()) {
            name = rs.getString("title");
        }
        return name;
    }

    public int getBookId(String title) throws SQLException {
        DatabaseConn db = new DatabaseConn();

        String query = "select book_id from book where title ='" + title + "' ";
        ResultSet rs = db.selectFun(query);
        int id = 0;

        while (rs.next()) {
            id = rs.getInt("book_ID");
        }
        return id;
    }

    //borrow books 
    public ArrayList getUserBooks(String username) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        Member m = new Member();
        int userId = m.getMemID(username);
        ArrayList<Book> arr = new ArrayList<Book>();
        Book bk = new Book();
        String query = "select * from borrowers where memberId ='" + userId + "'";
        ResultSet rs = db.selectFun(query);
        while (rs.next()) {
            bk.setBookId(rs.getInt(1));
            bk.setStartDate(rs.getString(3));
            bk.setReturnDate(rs.getString(4));

            arr.add(bk);
        }
        return arr;
    }

    // get start date and return date 
    public String[] startAndReturn(int bookId) throws SQLException {
        DatabaseConn db = new DatabaseConn();

        String DateArr[] = new String[2];
        String query = "select * from borrowers where bookId ='" + bookId + "'";
        ResultSet rs = db.selectFun(query);
        while (rs.next()) {
            DateArr[0] = rs.getString(3);
            DateArr[1] = rs.getString(4);

        }
        return DateArr;
    }

    public void extendPeriod(int bookId, int memberId, String newDate) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        String query = "update borrowers set end_date ='" + newDate + "' where bookID=" + bookId + " and memberId=" + memberId + " ";
        db.dmlFun(query);
        db.closeConn();
    }

}
