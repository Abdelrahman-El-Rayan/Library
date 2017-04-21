/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Admin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CASPER
 */
public class AddBook extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // title authername catname publisher pageno edition
            String title = request.getParameter("title");
            int pageNo = Integer.parseInt(request.getParameter("pageno"));
            int edition = Integer.parseInt(request.getParameter("edition"));
            String autherName = request.getParameter("authername");
            String catName = request.getParameter("catname");
            String publisher = request.getParameter("publisher");
            int avail = Integer.parseInt(request.getParameter("avail"));

            Admin ad = new Admin();

            int catID = ad.getIdFromTable("category", catName);
            int autherID = ad.getIdFromTable("auther", autherName);
            int publisherID = ad.getIdFromTable("publisher", publisher);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddBook</title>");
            out.println("</head>");
            out.println("<body>");

            ad.addNewBook(title, edition, pageNo, publisherID, autherID, catID, avail);
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
        }
    }
        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
                processRequest(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(AddBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
                processRequest(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(AddBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo

        
            () {
        return "Short description";
        }// </editor-fold>

    }
