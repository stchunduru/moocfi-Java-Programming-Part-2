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
public class Storehouse {
    private Map<String, Integer> items;
    private Map<String, Integer> stock;
    
    public Storehouse(){
        this.items = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String item, int cost, int stock){
        this.items.put(item, cost);
        this.stock.put(item, stock);
        
    }
    
    public int price(String item){
        if(this.items.containsKey(item)){
            return this.items.get(item);
        }
        return -99;
    }
    
    public int stock(String item){
        if(this.stock.containsKey(item)){
            return this.stock.get(item);
        }
        return 0;
    }
    
    public boolean take(String item){
        if(this.stock.containsKey(item) && this.stock.get(item) > 0){
            
            this.stock.put(item, this.stock.get(item) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> set = new HashSet<String>();
        for(String x : this.stock.keySet()){
            set.add(x);
        }
        return set;
    }
    
}
