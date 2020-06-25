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

public class OneThingBox extends Box{
    private Thing thing;
    
    public OneThingBox(){
        this.thing = null;
    }
    
    
    public void add(Thing x){
        if(this.thing == null){
            this.thing = x;
        }
    }
    
    @Override
    public boolean isInTheBox(Thing x){
        if(this.thing != null){
            if(this.thing.equals(x)){
                return true;
            }
        }
        return false;
    }
    
}
