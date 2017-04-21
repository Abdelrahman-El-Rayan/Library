/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Admin;
import Model.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddAuther extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String name= request.getParameter("name"); 
            String address =request.getParameter("address");
            Book bo =new Book();
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddCetegory</title>");            
            out.println("</head>");
            out.println("<body>");
            bo.addNewAuther(name, address);
            HttpSession session = request.getSession();
            Admin add = (Admin) session.getAttribute("admin");
            if (add != null) {
                String username = add.getUsername();
                String password = add.getPassword();
                String lev = add.getLevel(username, password);
                if (lev.equals("top")) {
                    RequestDispatcher req = request.getRequestDispatcher("controlpanel.jsp");
                    req.forward(request, response);
                } else {
                    RequestDispatcher req = request.getRequestDispatcher("lowcontrolpanel.jsp");
                    req.forward(request, response);
                }
            out.println("</body>");
            out.println("</html>");
        }
    }}

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddAuther.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddAuther.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
