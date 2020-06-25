/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;
import java.util.*;
import moving.domain.Item;
import moving.domain.Thing;
import moving.domain.Box;
/**
 *
 * @author Cruzer
 */
public class Packer {
    private int boxvolume;
    
    public Packer(int boxvolume){
        this.boxvolume = boxvolume;
    }
    
    public List<Box> packThings(List<Thing> list){
        
        int boxcount = 0;
        List<Box> boxes = new ArrayList<Box>();
        boxes.add(new Box(boxvolume));
        for(Thing x: list){
            if(boxes.get(boxcount).check(x)){
                boxes.get(boxcount).addThing(x);
            }else{
                boxcount += 1;
                boxes.add(new Box(boxvolume));
                boxes.get(boxcount).addThing(x);
            }
        }
        return boxes;
    }
}
