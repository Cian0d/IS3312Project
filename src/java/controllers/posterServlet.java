package controllers;

import dataaccess.posterdao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Poster;

@WebServlet(name = "posterServlet", urlPatterns = {"/posterServlet"})
public class posterServlet extends HttpServlet {

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
        /**Get specific instance of poster**/
        int id = 0;
       // ArrayList<Poster> posterList = posterdao.getInstance().getPoster();
        //movies?id = 3 
        try{
            id = Integer.parseInt(request.getParameter("id"));
        } catch (Exception e){
            
        }
        /**Send to posterdetails jsp based on id of chosen poster**/
        System.out.println(id);
        if (id > 0) {
         //   Poster pt = posterdao.getInstance().getPosterById(id);
           // if (pt == null) {
                response.sendRedirect("index.jsp");
            } else {
                
             //   request.setAttribute("poster", pt);
                request.getRequestDispatcher("posterdetails.jsp").forward(request, response);

                
            }

            //dynamic page
       // } else {
            //main product page

         //   request.getRequestDispatcher("index.jsp").forward(request, response);

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
  //  @Override
    //protected void doGet(HttpServletRequest request, HttpServletResponse response)
      //      throws ServletException, IOException {
        //processRequest(request, response);
    //}

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  //  @Override
   // protected void doPost(HttpServletRequest request, HttpServletResponse response)
     //       throws ServletException, IOException {
       // processRequest(request, response);
    //}

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
  //  @Override
    //public String getServletInfo() {
      //  return "Short description";
    //}// </editor-fold>

//}
