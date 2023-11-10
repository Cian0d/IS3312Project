
package models;

import dataaccess.posterdao;
import java.util.ArrayList;
import java.util.List;

/* This is the model concerned with the basket itself*/
/*
public class Basket {
    
    private ArrayList<AddToBasket> items;
    double total;

    public Basket() {
        items = new ArrayList<AddToBasket>();
    }

    public ArrayList<AddToBasket> getItems() {
        return items;
    }

    public int getCount() {
        return items.size();
    }
    
  

    public void addItem(String product) {
        
        for (AddToBasket products : this.items) {
            
            if(products.getProduct().getPosterName() == product) {
                products.increaseQuantity();
                return;
            }
        }
        AddToBasket newItem = new AddToBasket(posterdao.getInstance().getPosterByName(product), 1);
        this.items.add(newItem);
    } 
    
    public List<AddToBasket> getItem(){
        return this.items;
    }
    
   
    
    public void addItem(Poster product) {
        
        for (AddToBasket item : this.items) {
            
            if(item.getProduct() == product) {
                item.increaseQuantity();
                return;
            }
        }
         AddToBasket newItem = new AddToBasket((product), 1);
        this.items.add(newItem);
    } 
    
   

   // public double getTotProduct(){
     //   double total = 0;
       // for (AddToBasket item : this.items){
         //   total += item.getItemPrice();
        //}
       // return total;
   // }

    

    public void removeItem(AddToBasket item) {
        long code = (item.getProduct().getPosterID());
        for (int i = 0; i < items.size(); i++) {
            AddToBasket lineItem = items.get(i);
            if (lineItem.getProduct().equals(code)) {
                items.remove(i);
                return;
            }
        }
    }
    
}
*/