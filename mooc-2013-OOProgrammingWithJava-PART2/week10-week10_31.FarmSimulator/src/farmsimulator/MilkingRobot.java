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
public class MilkingRobot{
    private BulkTank tank;
    
    public MilkingRobot(){
        this.tank = null;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void setBulkTank(BulkTank a){
        this.tank = a;
    }
    
   
    public void milk(Milkable cow){
        try{
            this.tank.addToTank(cow.milk());
        }catch(Exception e){
            throw new IllegalStateException("Tank not installed");
        }
    }
    
    
    
}
