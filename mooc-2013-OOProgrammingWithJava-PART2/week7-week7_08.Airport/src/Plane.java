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
public class Plane {
    private HashMap<String, Integer> planes;
    
    public Plane(){
        this.planes = new HashMap<String, Integer>();
    }
    
    public void addPlane(String name, int weight){
        this.planes.put(name, weight);
    }
    
    public String getPlane(String name){
        for(String x : planes.keySet()){
            if(x.equals(name)){
                return x + " (" + planes.get(x) + " ppl) ";
            }
        }
        return null;
    }
    
    public void printPlanes(){
        for(String x : planes.keySet()){
            System.out.println(x + " (" + planes.get(x) + " ppl) ");
        }
    }
}
