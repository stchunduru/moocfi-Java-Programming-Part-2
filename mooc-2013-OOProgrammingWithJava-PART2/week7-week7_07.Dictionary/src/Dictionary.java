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

public class Dictionary {
    private HashMap<String, String> hmap;
    
    public Dictionary(){
        this.hmap = new HashMap<String, String>();
    }
    
    public void add(String x, String y){
        this.hmap.put(x, y);
    }
    
    public String translate(String x){
        if(this.hmap.containsKey(x)){
            return this.hmap.get(x);
        }else{
            return null;
        }
    }
    
    public int amountOfWords(){
        return this.hmap.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list= new ArrayList<String>();
        for(String x: this.hmap.keySet()){
            list.add(x + " = " + this.hmap.get(x));
        }
        return list;
    }
}
