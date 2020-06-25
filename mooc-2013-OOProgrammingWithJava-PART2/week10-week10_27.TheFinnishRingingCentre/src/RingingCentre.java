

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

public class RingingCentre {
    private Map<Bird, List<String>> list;
    
    public RingingCentre(){
        this.list = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        if(this.list.get(bird) == null){
            ArrayList<String> x = new ArrayList<String>();
            x.add(place);
            list.put(bird, x);
        }else{
            this.list.get(bird).add(place);
        }
    }
    
    public void observations(Bird bird){
        if(this.list.containsKey(bird)){
            for(Bird x : this.list.keySet()){
                if(x.equals(bird)){
                    System.out.println(x + " observations: " + this.list.get(x).size());
                    for(String place: this.list.get(x)){
                        System.out.println(place);
                    }
                }
            }
            
        }else{
            System.out.println(bird + " observations: " + 0);
        }
    }
}
