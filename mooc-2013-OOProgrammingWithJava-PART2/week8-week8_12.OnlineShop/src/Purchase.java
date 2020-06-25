/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cruzer
 */
public class Purchase {
    private String product;
    private int amount;
    private int price;
    
    public Purchase(String product, int amount, int price){
        this.product = product;
        this.amount = amount;
        this.price = price;
    }
    
    public int price(){
        return this.price*this.amount;
    }
    
    public String getProduct(){
        return this.product;
    }
    
    public int getAmount(){
        return this.amount;
    }
    
    public void increaseAmount(){
        this.amount += 1;
    }
    
    public String toString(){
        return this.product + ": " + this.amount;
    }
    
}
