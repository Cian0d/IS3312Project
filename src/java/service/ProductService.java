/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dataaccess.ProductDAO;
import java.util.ArrayList;
import models.Poster;

/**
 *
 * code taken from sample product viewer
 */
public class ProductService {
    
   
    public Poster getPoster(long posterId){
        ProductDAO pDAO = new ProductDAO();
        Poster product = pDAO.getPosterById(posterId);
        return product;
    }
    
    public ArrayList<Poster> getAllPosters(){
       
        ProductDAO pDao = new ProductDAO();
        ArrayList<Poster> posterList = pDao.getAllPosters();
        return posterList;
        
    }    
    
        public ArrayList<Poster> getHomePageProducts(){
        
        ProductDAO pDao = new ProductDAO();
        return pDao.getTopProducts(6);
        
    }
    
    public void insertProduct(Poster nPoster){
        ProductDAO pDao = new ProductDAO();
        pDao.insertProduct(nPoster);
        return;
        
    }     
    
    public void updatePoster(Poster nPoster){
        ProductDAO pDao = new ProductDAO();
        pDao.updatePoster(nPoster);
        return;
        
    }
        
    public void deletePoster(long posterID){
        ProductDAO pDao = new ProductDAO();
        pDao.deletePoster(posterID);
        return;
        
    }        
        
}
