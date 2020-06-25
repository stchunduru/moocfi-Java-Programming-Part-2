/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
/**
 *
 * @author Cruzer
 */
public class MindfulDictionary {
    private Map<String, String> list;
    private File file;
    private String filename;
    
    public MindfulDictionary(){
        this.list = new HashMap<String,String>();
        
    }
    
    public MindfulDictionary(String file){
        this.list = new HashMap<String,String>();
        this.file = new File(file);
    }
    
    public boolean load(){
        try{
            
            Scanner read = new Scanner(this.file);
            while(read.hasNextLine()){
                String []hold = read.nextLine().split(":");
                this.list.put(hold[0], hold[1]);
            }
            return true;
            
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean save(){
        try{
            FileWriter writer = new FileWriter(this.file);
            for(String word : this.list.keySet()){
                writer.write(word + ":" +list.get(word)+"\n");
            }
            writer.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    
    public void add(String word, String translation){
        if(!(this.list.containsKey(word))){
            this.list.put(word, translation);
        }
    }
    
    public String translate(String word){
        if(this.list.keySet().contains(word)){
            return this.list.get(word);
        }
        for(String x: this.list.keySet()){
            if(this.list.get(x).equals(word)){
                return x;
            }
        }
        return null;
    }
    
    public void remove(String word){
        if(this.list.keySet().contains(word)){
            this.list.remove(word);
        }
        String hold = "";
        for(String x: this.list.keySet()){
            if(this.list.get(x).equals(word)){
                hold = x;
            }
        }
        this.list.remove(hold);
    }
        
}

