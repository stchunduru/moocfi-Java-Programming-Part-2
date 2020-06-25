/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.*;

/**
 *
 * @author Cruzer
 */
public class Group implements Movable{
    
    private Set<Movable> group;
    
    public Group(){
        this.group = new HashSet<Movable>();
    }
    
    public void addToGroup(Movable thing){
        group.add(thing);
    }
    
    public void move(int dx, int dy){
        for(Movable x: this.group){
            x.move(dx, dy);
        }
    }
    
    public String toString(){
        String o = "";
        for(Movable x: this.group){
            o += x + "\n";
        }
        return o;
    }
}
