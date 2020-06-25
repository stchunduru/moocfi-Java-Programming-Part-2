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
public class Container {
    private ArrayList<Suitcase> container;
    private int maxweight;
    private int weightcount;
    
    public Container(int maxweight){
        this.container = new ArrayList<Suitcase>();
        this.maxweight = maxweight;
        this.weightcount = 0;
    }
    
    public void addSuitcase(Suitcase x){
        
            if(this.weightcount + x.totalWeight() <= this.maxweight){
                this.container.add(x);
                this.weightcount += x.totalWeight();
            }
        
    }
    
    
    public void printThings(){
        for(Suitcase x: this.container){
            x.printThings();
        }
    }
    
    public String toString(){
        return this.container.size() + " suitcases (" + this.weightcount + " kg)";
    }
}
