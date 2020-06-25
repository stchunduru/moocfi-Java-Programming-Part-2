/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
import java.util.*;
/**
 *
 * @author Cruzer
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private int duplicatecount;
    private Set<String> list;
    
    public PersonalDuplicateRemover(){
        this.list = new HashSet<String>();
        this.duplicatecount = 0;
    }
    
    public void add(String word){
        if(list.contains(word)){
            duplicatecount += 1;
        }else{
            list.add(word);
        }
    }
    
    public int getNumberOfDetectedDuplicates(){
        return duplicatecount;
    }
    
    public Set<String> getUniqueCharacterStrings(){
        return list;
    }
    
    public void empty(){
        duplicatecount = 0;
        list.clear();
    }
    
}
