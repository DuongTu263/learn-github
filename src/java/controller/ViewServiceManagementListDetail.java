/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ServiceDAO;
import dao.UserDAO;
import dao.impl.ServiceDAOImpl;
import dao.impl.UserDAOImpl;
import entity.Doctor;
import entity.Service;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

/**
 * <h1>View Feedback Management List Controller </h1>
 * Controller to view feedback management list. Method process data form
 * FeedbackDAO and forward data to file view
 * <p>
 *
 *
 * @author Duong Anh Tu
 * @version 1.0
 *  @since 2022-05-22
 */
public class ViewServiceManagementListDetail extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int id = Integer.parseInt(request.getParameter("Id"));
        String page = request.getParameter("page").toString();
        request.getSession().setAttribute("page", page);
        ServiceDAO serviceDAO = new ServiceDAOImpl();
        Service service = serviceDAO.getById(id);

        UserDAO userDAO = new UserDAOImpl();
        List<Doctor> doctors = userDAO.getDoctorByServiceId(service.getServiceId());
        request.setAttribute("service", service);
        request.setAttribute("doctors", doctors);
        List<Doctor> allDoctors = userDAO.getAllDoctor();
        request.setAttribute("allDoctors", allDoctors);
        request.getRequestDispatcher("./jsp/viewService.jsp").forward(request, response);
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
