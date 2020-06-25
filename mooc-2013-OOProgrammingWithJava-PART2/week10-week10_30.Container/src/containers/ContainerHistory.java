/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.*;

/**
 *
 * @author Cruzer
 */
public class ContainerHistory {
    private List<Double> list;
    
    public ContainerHistory(){
        this.list = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.list.add(situation);
    }
    
    public void reset(){
        this.list.clear();
    }
    
    public double getLastValue(){
        return this.list.get(this.list.size()-1);
    }
    
    public double maxValue(){
        if(this.list.isEmpty()){
            return 0;
        }else{
            return Collections.max(this.list);
        }
    }
    
    public double minValue(){
        if(this.list.isEmpty()){
            return 0;
        }else{
            return Collections.min(this.list);
        }
    }
    
    public double average(){
        if(this.list.isEmpty()){
            return 0;
        }else{
            double av = 0;
            for(double x : this.list){
                av += x;
            }
            return av/this.list.size();
        }
    }
    
    public double greatestFluctuation(){
        double g = 0;
        for(int x = 1; x < this.list.size(); x++){
            if(Math.abs(list.get(x)-list.get(x-1)) > g){
                g = Math.abs(list.get(x)-list.get(x-1));
            }
        }
        return g;
    }
    
    public double variance(){
        if(this.list.isEmpty() || this.list.size() == 1){
            return 0;
        }else{
            double av = average();
            double tot = 0;
            for(double x : this.list){
                tot += Math.pow((x - av),2);
            }
            return tot/(list.size()-1);
        }
    }
    
    public String toString(){
        return this.list.toString();
    }
    
}
