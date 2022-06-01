/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import dao.impl.UserDAOImpl;
import entity.Account;
import entity.Pagination;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class uses <code>dao.impl.UserDAOImpl</code> functions:<br>
 * getAllAccount to get all account from database.
 *
 * Bugs: none
 *
 * @author Nam Hai
 */
public class GetAllAccountController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /**
     * Use function getAllAccount in <code>dao.impl.UserDAOImpl</code> to get a
     * <code>java.util.List</code> object that contains a series of
     * <code>entity.Account</code><br>
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String page = request.getParameter("page");
        String search = request.getParameter("search");
        if (search == null) {
            search = "";
        }
        int pageIndex = 1;
        if (page != null) {
            try {
                pageIndex = Integer.parseInt(page);
                if (pageIndex == -1) {
                    pageIndex = 1;
                }
            } catch (Exception e) {
                pageIndex = 1;
            }
        } else {
            pageIndex = 1;
        }
        int pageSize = 5;
        UserDAO userDAO = new UserDAOImpl();
        Pagination<Account> users = userDAO.getAllAccount(pageIndex, pageSize, search);
        request.setAttribute("users", users);
        request.setAttribute("search", search);
        request.getRequestDispatcher("./jsp/viewAllAccount.jsp").forward(request, response);
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
