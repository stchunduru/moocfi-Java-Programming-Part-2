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

public class PromissoryNote {
    private HashMap<String, Double> hmap;
    
    public PromissoryNote(){
        this.hmap = new HashMap<String, Double>();
    }
    
    public void setLoan(String name, double amount){
        this.hmap.put(name, amount);
    }
    
    public double howMuchIsTheDebt(String name){
        if(this.hmap.containsKey(name)){
            return this.hmap.get(name);
        }else{
            return 0;
        }
 
    }
}
