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
public class Flights {
    private ArrayList<String> list1;
    
    public Flights(){
        
        this.list1 = new ArrayList();
    }
    
    public void addFlight(String x, String dep, String des){
        String path = "(" + dep +"-" + des + ")";
        String entry = x + path;
        list1.add(entry);
    }
    
    public void printFlights(Plane planes){
        for(String x : this.list1){
            System.out.println(x);
        }
    }
    
}
