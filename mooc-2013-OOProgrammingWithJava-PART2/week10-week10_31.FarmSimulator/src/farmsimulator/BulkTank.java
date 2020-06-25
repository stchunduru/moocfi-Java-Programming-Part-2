/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Cruzer
 */
public class BulkTank {
    
    private double capacity;
    private double volume;
    
    public BulkTank(){
        this.capacity = 2000;
        this.volume = 0;
    }
    
    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount){
        this.volume += amount;
        if(this.volume > this.capacity){
            this.volume = capacity;
        }
    }
    
    public double getFromTank(double amount){
        double left = 0;
        if(amount <= this.volume){
            this.volume -= amount;
            return amount;
        }else{
            left = this.volume;
            this.volume = 0;
            return left;
        }
    }
    
    public String toString(){
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
    
    
}
