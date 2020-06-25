/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Cruzer
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    
    public Barn(BulkTank tank){
        this.tank = tank;
        this.robot = null;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot a){
        this.robot = a;
        this.robot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow){
        if(this.robot == null){
            throw new IllegalStateException("Robot not installed");
        }else{
            this.robot.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(this.robot == null){
            throw new IllegalStateException("Robot not installed");
        }else{
            for(Cow cow : cows){
                this.robot.milk(cow);
            }
        }
    }
    
    public String toString(){
        return this.tank.toString();
    }
    
    
}
