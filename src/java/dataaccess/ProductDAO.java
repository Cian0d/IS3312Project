/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import models.Poster;
import models.User;
import utils.DBManager;

/**
 *
 * code taken from sample product viewer
 */
public class ProductDAO {


    public Poster getPosterById(long posterId) {

        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        String posterName = null;
        String posterDescription = null;
        String posterType = null;
        String posterSize = null;
        String posterMaterial = null;
        String posterAge = null;
        String posterPrice = null;
        String posterImage = null;
        Poster tempPoster = new Poster();

        String query = String.format("SELECT * FROM PRODUCTS WHERE PRODUCT_ID=%d",posterId);
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                posterName = (rs.getString(2));
                posterDescription = (rs.getString(3));
                posterType = (rs.getString(4));
                posterSize = (rs.getString(5));
                posterMaterial = (rs.getString(6));
                posterAge = (rs.getString(7));
                posterPrice = (rs.getString(8));
                posterImage = (rs.getString(9));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        tempPoster.setPosterID(posterId);
        tempPoster.setPosterName(posterName);
        tempPoster.setPosterDescription(posterDescription);
        tempPoster.setPosterType(posterType);
        tempPoster.setPosterSize(posterSize);
        tempPoster.setPosterMaterial(posterMaterial);
        tempPoster.setPosterAge(posterAge);
        tempPoster.setPosterPrice(posterPrice);
        tempPoster.setPosterImage(posterImage);
        return tempPoster;

}
    
        public Poster getPosterByName(String posterName) {

        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        int posterId = 0;
        String posterDescription = null;
        String posterType = null;
        String posterSize = null;
        String posterMaterial = null;
        String posterAge = null;
        String posterPrice = null;
        String posterImage = null;
        Poster tempPoster = new Poster();

        String query = String.format("SELECT * FROM PRODUCTS WHERE NAME=" + "'" + posterName + "'");
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                posterId = (rs.getInt(2));
                posterDescription = (rs.getString(3));
                posterType = (rs.getString(4));
                posterSize = (rs.getString(5));
                posterMaterial = (rs.getString(6));
                posterAge = (rs.getString(7));
                posterPrice = (rs.getString(8));
                posterImage = (rs.getString(9));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        tempPoster.setPosterID(posterId);
        tempPoster.setPosterName(posterName);
        tempPoster.setPosterDescription(posterDescription);
        tempPoster.setPosterType(posterType);
        tempPoster.setPosterSize(posterSize);
        tempPoster.setPosterMaterial(posterMaterial);
        tempPoster.setPosterAge(posterAge);
        tempPoster.setPosterPrice(posterPrice);
        tempPoster.setPosterImage(posterImage);
        return tempPoster;

}
    
        public ArrayList<Poster> getAllPosters() {

        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int posterId = 0;
        String posterName = null;
        String posterDescription = null;
        String posterType = null;
        String posterSize = null;
        String posterMaterial = null;
        String posterAge = null;
        String posterPrice = null;
        String posterImage = null;      
        ArrayList<Poster> posterData = new ArrayList();

        String query = "SELECT * FROM PRODUCTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                posterId = (rs.getInt(1));
                posterName = (rs.getString(2));
                posterDescription = (rs.getString(3));
                posterType = (rs.getString(4));
                posterSize = (rs.getString(5));
                posterMaterial = (rs.getString(6));
                posterAge = (rs.getString(7));
                posterPrice = (rs.getString(8));
                posterImage = (rs.getString(9));
                Poster tempPoster = new Poster();
        tempPoster.setPosterID(posterId);
        tempPoster.setPosterName(posterName);
        tempPoster.setPosterDescription(posterDescription);
        tempPoster.setPosterType(posterType);
        tempPoster.setPosterSize(posterSize);
        tempPoster.setPosterMaterial(posterMaterial);
        tempPoster.setPosterAge(posterAge);
        tempPoster.setPosterPrice(posterPrice);
        tempPoster.setPosterImage(posterImage);
        posterData.add(tempPoster);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return posterData;

    }
    
        public void insertProduct(Poster newPoster){
        
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;
        
        try {
        
            stmt = con.createStatement();
            String sql = String.format("INSERT INTO PRODUCTS(NAME,DESCRIPTION, CATEGORY, SIZE, MATERIAL, AGE, PRICE,IMAGE_LOCATION) " + 
                            "VALUES('%s','%s','%s','%s','%s','%s','%s','%s')",newPoster.getPosterName(),newPoster.getPosterDescription(),newPoster.getPosterType(),newPoster.getPosterSize(),newPoster.getPosterMaterial(),newPoster.getPosterAge(),newPoster.getPosterPrice(),newPoster.getPosterImage());
            stmt.executeUpdate(sql);
        }
        catch (SQLException e){
            e.printStackTrace();
         }finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
        
        public void updatePoster(Poster newPoster){
        
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;
        
        try {
        
            stmt = con.createStatement();
            String sql = String.format("UPDATE PRODUCTS SET NAME='%s',DESCRIPTION='%s',CATEGORY='%s',SIZE='%s',MATERIAL='%s',AGE='%s',PRICE='%s',IMAGE_LOCATION='%s' where PRODUCT_id=%d ",newPoster.getPosterName(),newPoster.getPosterDescription(),newPoster.getPosterType(),newPoster.getPosterSize(),newPoster.getPosterMaterial(),newPoster.getPosterAge(),newPoster.getPosterPrice(),newPoster.getPosterImage(),newPoster.getPosterID());
            stmt.executeUpdate(sql);
        }
        catch (SQLException e){
            e.printStackTrace();
         }finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
        
        
        
    /* Gets number of top products specified */
    /* we are gonna fake this one */
    public ArrayList<Poster> getTopProducts(int numProducts){
    
        
        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int productId = 0;
        String name = null;
        String description = null;
        String type = null;
        String size = null;
        String material = null;
        String age = null;
        String price;
        String imageLocation = null;

        ArrayList<Poster> productData = new ArrayList();

        String query = "SELECT * FROM PRODUCTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            int productCount = 0;
            while (rs.next()) {
                if (productCount >= numProducts)
                    break;
                productId = (rs.getInt(1));
                name = (rs.getString(2));
                description = (rs.getString(3));
                type = (rs.getString(4));
                size = (rs.getString(5));
                material = (rs.getString(6));
                age = (rs.getString(7));
                price = (rs.getString(8));
                imageLocation = (rs.getString(9));
                Poster product = new Poster();
                product.setPosterID(productId);
                product.setPosterName(name);
                product.setPosterDescription(description);
                product.setPosterType(type);
                product.setPosterSize(size);
                product.setPosterMaterial(material);
                product.setPosterAge(age);
                product.setPosterPrice(price);
                product.setPosterImage(imageLocation);
                productData.add(product);
                productCount++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return productData;
        
         
        
    }
    
        public void deletePoster(long posterID){
        
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;
        
        try {
        
            stmt = con.createStatement();
            String sql = String.format("DELETE FROM PRODUCTS WHERE PRODUCT_ID=%d",posterID);
            stmt.executeUpdate(sql);
        }
        catch (SQLException e){
            e.printStackTrace();
         }finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
