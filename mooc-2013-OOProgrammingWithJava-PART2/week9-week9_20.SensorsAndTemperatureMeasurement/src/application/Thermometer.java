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
public class Thermometer implements Sensor{
    private Random random;
    private boolean tick;
    
    public Thermometer(){
        this.random = new Random();
        this.tick = false;
    }
    
    public boolean isOn(){
        return this.tick;
    }
    
    public void on(){
        this.tick = true;
        
    }
    
    public void off(){
        this.tick = false;
    }
    
    public int measure(){
        if(isOn()){
            return random.nextInt(61) + (-30);
        }else{
            throw new IllegalStateException("Sensor is off");
        }
    }
}
