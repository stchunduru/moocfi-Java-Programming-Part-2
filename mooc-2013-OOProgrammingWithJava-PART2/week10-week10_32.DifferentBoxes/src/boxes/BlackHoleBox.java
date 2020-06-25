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
public class BlackHoleBox extends Box{
    
    private Thing thing;
    public BlackHoleBox(){
        this.thing = null;
    }
    
    public void add(Thing x){
        if(this.thing != null){
            this.thing = x;
        }
    }
    
    public boolean isInTheBox(Thing x){
        return false;
    }
    
    
}
