/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.*;

/**
 *
 * @author Cruzer
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> list;
    
    public PersonalMultipleEntryDictionary(){
        this.list = new HashMap<String, Set<String>>();
    }
    
    public void add(String word, String entry){
        if(list.containsKey(word)){
            list.get(word).add(entry);
        }else{
            Set<String> x = new HashSet<String>();
            x.add(entry);
            list.put(word, x);
        }
    }
    
    public Set<String> translate(String word){
        if(list.containsKey(word)){
            return list.get(word);
        }else{
            return null;
        }
    }
    
    public void remove(String word){
        if(list.containsKey(word)){
            list.remove(word);
        }
    }
    
    
}
