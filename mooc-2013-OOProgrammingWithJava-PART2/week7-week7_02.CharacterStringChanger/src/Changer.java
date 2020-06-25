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
public class Changer {
    
    private ArrayList<Change> list;
    
    public Changer(){
        this.list = new ArrayList<Change>();
    }
    
    public void addChange(Change x){
        if(!this.list.contains(x)){
            this.list.add(x);
        }
    }
    
    public String change(String x){
        for(Change i : this.list){
            x = i.change(x);
        }
        return x;
    }
    
    
}
