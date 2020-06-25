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
public class Hand implements Comparable<Hand>{
    
    private List<Card> list;
    
    public Hand(){
        this.list = new ArrayList<Card>();
    }
    
    public void add(Card x){
        this.list.add(x);
    }
    
    public void sort(){
        Collections.sort(this.list);
    }
    
    public void print(){
        for(Card x : this.list){
            System.out.println(x);
        }
    }
    
    public List<Card> arrlist(){
        return this.list;
    }
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue a = new SortAgainstSuitAndValue();
        Collections.sort(list, a);
    }
    
    
    @Override
    public int compareTo(Hand other){
        int now = 0, lop = 0;
      
        for(int x = 0; x < other.arrlist().size(); x++){
            lop += other.arrlist().get(x).getValue(); 
        }
        for(int x = 0; x < this.list.size(); x++){
            now += this.list.get(x).getValue();
        }
        
        if(now == lop){
            return 0;
        }else{
            return now - lop;
        }
    }
    
    
}
