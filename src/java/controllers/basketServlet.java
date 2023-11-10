package controllers;

import dataaccess.posterdao;
//import models.Basket;
import models.Poster;
import models.AddToBasket;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "basketServlet", urlPatterns = {"/basketServlet"})
public class basketServlet extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        /**Creates session for login**/
        HttpSession session = request.getSession(false);
        String useremail = (String) session.getAttribute("email");
        /**If not logged in then displays alert and redirects**/
        if (useremail== null) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Must log in to add item to basket! Redirecting to products page...');");
            out.println("location='allposters.jsp';");
            out.println("</script>");
        /**If logged in then creates basket**/
        } else {
            int id = (int) Integer.parseInt(request.getParameter("PosterID"));
           // Poster product = posterdao.getInstance().getPosterById(id);

          //  Basket basket = (Basket) session.getAttribute("basket");
            // if (basket == null) {
              //   basket = new Basket();
             }


             //basket.addItem(product.getPosterName());

           //  session.setAttribute("basket", basket);
             response.sendRedirect("basket.jsp");
        }
             
            
            
            
            
            
            
            
        }
        
        
        
          
    //@Override
   // protected void doPost(HttpServletRequest request, HttpServletResponse response)
     //       throws ServletException, IOException {

       // request.getRequestDispatcher("basket.jsp").forward(request, response);
    
    //}
  //  @Override
    //public String getServletInfo(){
      //  return "Short description";
    //}
    
//}

    
