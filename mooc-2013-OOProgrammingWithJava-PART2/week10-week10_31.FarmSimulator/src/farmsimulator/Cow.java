/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Cruzer
 */
public class Cow implements Milkable, Alive{
    private String name;
    private int udders;
    private double milk;
    private Random random = new Random();
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.udders = random.nextInt(26)+15;
        this.milk = 0;
    }
    
    public Cow(String name){
        this.name = name;
        this.udders = random.nextInt(26)+15;
        this.milk = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.udders;
    }
    
    public double getAmount(){
        return this.milk;
    }
    
    public void liveHour(){
        double mil = (7 + random.nextInt(20 - 7 + 1)) / 10.0;
        if(this.milk + mil > this.udders){
            this.milk = this.udders;
        }else{
            this.milk += mil;
        }
    }
    
    public double milk(){
        double hold = this.milk;
        this.milk = 0;
        return hold;
    }
    
    public String toString(){
        return this.name + " " + Math.ceil(this.milk) + "/" + this.udders;
    }
        
}
    

