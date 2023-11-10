/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Poster;
import service.ProductService;

/**
 *
 * code taken from sample product viewer
 */
public class productServlet extends HttpServlet {

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
        String action = request.getParameter("action");
        ServletContext context = getServletContext();
        ProductService pServ = new ProductService();
        String url = null;
        if (action == null)
            request.getRequestDispatcher("/Home").forward(request, response);
        if (action.equals("listProducts")){
            ArrayList<Poster> posters = pServ.getAllPosters();
            request.setAttribute("posters", posters);
            context.setAttribute("posters", posters);
            request.getRequestDispatcher("productadmin.jsp").forward(request, response);
        }
        if (action.equals("listPosters")){
            ArrayList<Poster> posters = pServ.getAllPosters();
            request.setAttribute("posters", posters);
            context.setAttribute("posters", posters);
            request.getRequestDispatcher("allposters.jsp").forward(request, response);
        }
        
        if (action.equals("add")){
            request.getRequestDispatcher("addproduct.jsp").forward(request, response);
        }
        if (action.equals("deletePoster")){
            deletePoster(request,response);
            ArrayList<Poster> posters = pServ.getAllPosters();
            request.setAttribute("posters", posters);
            context.setAttribute("posters", posters);
            request.getRequestDispatcher("productadmin.jsp").forward(request, response);
        }
        if (action.equals("insertProduct")){
            insertProduct(request,response);
            ArrayList<Poster> posters = pServ.getAllPosters();
            request.setAttribute("posters", posters);
            context.setAttribute("posters", posters); 
            request.getRequestDispatcher("productadmin.jsp").forward(request, response);
        }
        if (action.equals("updateCompleteProduct")){
            updatePoster(request,response);
            ArrayList<Poster> posters = pServ.getAllPosters();
            request.setAttribute("posters", posters);
            context.setAttribute("posters", posters); 
            request.getRequestDispatcher("productadmin.jsp").forward(request, response);
        }
        
        if (action.equals("edit")){
            String posterId = request.getParameter("posterID");
            if (posterId == null)
                request.getRequestDispatcher("editproduct.jsp").forward(request, response);
            else {
                long pId = Long.parseLong(posterId);
                pServ = new ProductService();
                Poster oldPoster = pServ.getPoster(pId);
                request.setAttribute("oldPoster", oldPoster);
                request.getRequestDispatcher("editproduct.jsp").forward(request, response);
            }
               
        }
         if (action.equals("view")){
            String posterId = request.getParameter("posterID");
            if (posterId == null)
                request.getRequestDispatcher("posterdetails.jsp").forward(request, response);
            else {
                long pId = Long.parseLong(posterId);
                pServ = new ProductService();
                Poster oldPoster = pServ.getPoster(pId);
                request.setAttribute("oldPoster", oldPoster);
                request.getRequestDispatcher("posterdetails.jsp").forward(request, response);
            }
               
        }
        else
            request.getRequestDispatcher("adminhome.jsp").forward(request, response);
       
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
        processRequest(request,response);
       
    }
   
    private void insertProduct(HttpServletRequest request, HttpServletResponse response){
        String posterName = request.getParameter("posterName");
        String posterDescription = request.getParameter("posterDescription");
        String posterType = request.getParameter("posterType");
        String posterSize = request.getParameter("posterSize");
        String posterMaterial = request.getParameter("posterMaterial");
        String posterAge = request.getParameter("posterAge");
        String posterPrice = request.getParameter("posterPrice");
        String posterImage = request.getParameter("posterImage");
        Poster newPoster = new Poster();
        newPoster.setPosterName(posterName);
        newPoster.setPosterDescription(posterDescription);
        newPoster.setPosterType(posterType);
        newPoster.setPosterSize(posterSize);
        newPoster.setPosterMaterial(posterMaterial);
        newPoster.setPosterAge(posterAge);
        newPoster.setPosterPrice(posterPrice);
        newPoster.setPosterImage(posterImage);
        ProductService pServ = new ProductService();
        pServ.insertProduct(newPoster);
       
       
       
    }
   
    private void updatePoster(HttpServletRequest request, HttpServletResponse response){
       
        long id = Long.parseLong(request.getParameter("posterID"));
        String posterName = request.getParameter("posterName");
        String posterDescription = request.getParameter("posterDescription");
        String posterType = request.getParameter("posterType");
        String posterSize = request.getParameter("posterSize");
        String posterMaterial = request.getParameter("posterMaterial");
        String posterAge = request.getParameter("posterAge");
        String posterPrice = request.getParameter("posterPrice");
        String posterImage = request.getParameter("posterImage");

        ProductService pServ = new ProductService();
        Poster existingPoster = pServ.getPoster(id);
        
        existingPoster.setPosterID(id);
        existingPoster.setPosterName(posterName);
        existingPoster.setPosterDescription(posterDescription);
        existingPoster.setPosterType(posterType);
        existingPoster.setPosterSize(posterSize);
        existingPoster.setPosterMaterial(posterMaterial);
        existingPoster.setPosterAge(posterAge);
        existingPoster.setPosterPrice(posterPrice);
        existingPoster.setPosterImage(posterImage);
       
        pServ.updatePoster(existingPoster);
       
    }
   
    private void deletePoster(HttpServletRequest request, HttpServletResponse response){
       
        Long posterId = Long.parseLong(request.getParameter("posterID"));
        ProductService pServ = new ProductService();
        pServ.deletePoster(posterId);
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