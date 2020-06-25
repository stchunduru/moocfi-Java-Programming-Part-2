/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cruzer
 */
import java.util.*;
public class ShoppingBasket {
    
    private Map<Purchase, Integer> basket;
    
    public ShoppingBasket(){
        this.basket = new HashMap<Purchase, Integer>();
    }
    
    public void add(String product, int price){
        Purchase x = new Purchase(product, 1, price);
        int check = 0;
        for(Purchase i : this.basket.keySet()){
            if(i.getProduct().equals(x.getProduct())){
                i.increaseAmount();
                check += 1;
            }
        }
        if(check == 0){
            this.basket.put(x, price);
        }
    }
    
    public int price(){
        int total = 0;
        for(Purchase x : this.basket.keySet()){
            total += x.getAmount() * this.basket.get(x);
        }
        return total;
    }
    
    public void print(){
        for(Purchase x : this.basket.keySet()){
            System.out.println(x.getProduct() + ": " + x.getAmount());
        }
    }
    
    
    
    
    
}
