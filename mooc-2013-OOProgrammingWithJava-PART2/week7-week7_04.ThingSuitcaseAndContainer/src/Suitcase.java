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

public class Suitcase {
    private ArrayList<Thing> list;
    private int maxweight;
    private int totalweight;
    
    public Suitcase(int maxweight){
        this.list = new ArrayList<Thing>();
        this.maxweight = maxweight;
        this.totalweight = 0;
    }
    
    public void addThing(Thing x){
        
            if(this.totalweight + x.getWeight() <= this.maxweight){
                this.list.add(x);
                this.totalweight += x.getWeight();
            }
        
    }
    
    public void printThings(){
        for(Thing x: this.list){
            System.out.println(x);
        }
    }
    
    public Thing heaviestThing(){
        Thing next = new Thing(null, 0);
        int heavy = 0;
        for(Thing x: this.list){
            if(x.getWeight() > heavy){
                heavy = x.getWeight();
                next = x;
            }
        }
        if(heavy == 0){
            return null;
        }else{
            return next;
        }
    }
    
    public int totalWeight(){
        return this.totalweight;
    }
    
    public String toString(){
        if(this.list.isEmpty()){
            return "empty (" + this.totalweight + " kg)";
        }else if(this.list.size() == 1){
            return this.list.size() + " thing (" + this.totalweight + " kg)";
        }else{
            return this.list.size() + " things (" + totalWeight() + " kg)";
        }
    }
}
