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
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory conhis;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        this.conhis = new ContainerHistory();
        this.conhis.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }
    
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.conhis.add(conhis.getLastValue() + amount);
    }
    
    public double takeFromTheContainer(double amount){
        double b = super.takeFromTheContainer(amount);
        this.conhis.add(conhis.getLastValue()-amount);
        return b;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + conhis.toString());
        System.out.println("Greatest product amount: " + conhis.maxValue());
        System.out.println("Smallest product amount: " + conhis.minValue());
        System.out.println("Average: " + conhis.average());
        System.out.println("Greatest change: " + conhis.greatestFluctuation());
        System.out.println("Variance: " + conhis.variance());
    }
    
    public String history(){
        return this.conhis.toString();
    }
}
