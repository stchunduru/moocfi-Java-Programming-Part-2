/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.*;
/**
 *
 * @author Cruzer
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    
    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void manageCows(){
        this.barn.takeCareOf(cows);
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
    
    public void liveHour(){
        for(Cow cow : this.cows){
            cow.liveHour();
        }
    }
    
    public String toString(){
        if(this.cows.isEmpty()){
            return "Farm owner: " + this.owner + "\nBarn bulk tank: " + 
                    this.barn.toString() + "\nNo cows.";
        }else{
            String a = "\nAnimals:";
            for(Cow cow : this.cows){
                a += "\n        " + cow;
            }
            return "Farm owner: " + this.owner + "\nBarn bulk tank: " + 
                    this.barn.toString() + a;
        }
    }
    
    
    
    
    
    
}
