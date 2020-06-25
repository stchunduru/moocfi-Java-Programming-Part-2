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
public class Box implements ToBeStored{
    private double maxweight;
    private Map<ToBeStored, Double> list;
    
    public Box(double maxweight){
        this.maxweight = maxweight;
        this.list = new HashMap<ToBeStored, Double>();
    }
    
    public void add(ToBeStored x){
        if(!this.list.containsKey(x)){
            if((weight() + x.weight()) <= this.maxweight)
            this.list.put(x, x.weight());
        }
    }
    
    public double weight(){
        double a = 0.0;
        for(ToBeStored x: this.list.keySet())
        {
            a += x.weight();
        }
        return a;
    }
    
    public String toString(){
        return "Box: " + this.list.size() + " things, "
                + "total weight " + (double)Math.round(weight()) + " kg";
    }
    
}
