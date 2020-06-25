/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Cruzer
 */
import java.util.*;

public class MaxWeightBox extends Box{
    private int maxweight;
    private List<Thing> list;
    
    public MaxWeightBox(int maxweight){
        this.maxweight = maxweight;
        this.list = new ArrayList<Thing>();
    }
    
    public void add(Thing thing){
        int currentweight = 0;
        for(Thing x : this.list){
            currentweight += x.getWeight();
        }
        if(!(thing.getWeight() + currentweight > maxweight)){
            this.list.add(thing);
        }
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        return this.list.contains(thing);
    }
    
    
}
