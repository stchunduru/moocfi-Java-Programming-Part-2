/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationlogic;

/**
 *
 * @author Cruzer
 */
public class PersonalCalculator{
    
    private int count;
    
    public PersonalCalculator(){
        this.count = 0;
    }
    
    public int giveValue(){
        return this.count;
    }
    
    public void increase(){
        this.count += 1;
    }
    
}
