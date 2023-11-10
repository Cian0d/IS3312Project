package models;

import java.text.NumberFormat;

/* This is the model concerned with adding posters to the basket */
public class AddToBasket{
    
    private Poster product;
    private int quantity;

    public AddToBasket() {}
    
    public AddToBasket(Poster product,int quantity) {
    this.product=product;
    this.quantity= quantity;
    }
    

    public void setProduct(Poster pr) {
        product = pr;
    }

    public Poster getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    
        
    
    
    public void increaseQuantity (){
        this.quantity = this.quantity +=1;
    }
    
    public void decreaseQuantity (){
        this.quantity = this.quantity -1;
    }
    //public double getTotal() {
      //  double total = product.getPosterPrice() * quantity;
        //return total;
    //}

   // public String getTotalCurrency() {
     //   NumberFormat currency = NumberFormat.getCurrencyInstance();
       // return currency.format(this.getTotal());
    //}
    
    public String getProductName(){
        return product.getPosterName();
    }
    
   // public double getItemPrice(){
     //   return quantity * product.getPosterPrice();
    //}
    
    public String getImage() {
        return product.getPosterImage();
    }
    

}