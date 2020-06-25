/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.*;
/**
 *
 * @author Cruzer
 */
public class Box implements Thing{
    
    private int max;
    private List<Thing> items;
    
    
    public Box(int max){
        this.max = max;
        this.items = new ArrayList<Thing>();
        
    }
    
    public boolean addThing(Thing item){
        if(item.getVolume() + this.currentVolume() <= this.max){
            this.items.add(item);
            
            return true;
        }
        return false;
    }
    
    public boolean check(Thing item){
        if(item.getVolume() + this.currentVolume() <= this.max){
            return true;
        }
        return false;
    }
    
    public int currentVolume(){
        int total = 0;
        for(Thing x : this.items){
            total += x.getVolume();
        }
        return total;
    }
    
    public int getVolume(){
        return currentVolume();
    }
    
    public String toString(){
        return "  things in the box: " + getVolume() + " dm^3";
    }
    
}
