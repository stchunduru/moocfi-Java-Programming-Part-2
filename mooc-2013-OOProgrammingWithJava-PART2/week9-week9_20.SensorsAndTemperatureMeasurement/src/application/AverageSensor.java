/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.*;
/**
 *
 * @author Cruzer
 */
public class AverageSensor implements Sensor{
    private List<Sensor> list;
    private List<Integer> readings;
    
    public AverageSensor(){
        
        this.list = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor a){
        this.list.add(a);
    }
    
    public boolean isOn(){
        for(Sensor x : this.list){
            if(!(x.isOn())){
                return false;
            }
        }
        return true;
    }
    
    public void on(){
        for(Sensor x : this.list){
            x.on();
        }
    }
    
    public void off(){
        for(Sensor x : this.list){
            x.off();
        }
    }
    
    public int measure(){
        if(!(isOn()) || this.list.isEmpty()){
            throw new IllegalStateException("Multistatic error achieved");
        }else{
            int average = 0;
            for(Sensor x : this.list){
                if(x.isOn()){
                    average += x.measure();
                }
            }
            average = average/this.list.size();
            this.readings.add(average);
            return average;
        }
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
    
    
}
