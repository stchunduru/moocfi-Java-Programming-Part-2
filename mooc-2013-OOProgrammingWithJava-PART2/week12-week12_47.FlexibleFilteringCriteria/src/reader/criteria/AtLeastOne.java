/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;
import java.util.*;
/**
 *
 * @author Cruzer
 */
public class AtLeastOne implements Criterion{
    
    private Criterion []arr;
    
    public AtLeastOne(Criterion... values){
        this.arr = values;
    }
    
    public boolean complies(String line){
        if(arr.length != 0){
            for(Criterion x : arr){
                if(x.complies(line)){
                    return true;
                }
            }
        }
        return false;
    }
}
