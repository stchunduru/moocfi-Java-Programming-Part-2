/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cruzer
 */
public class MilitaryService implements NationalService{
    private int daysLeft;
    
    public MilitaryService(int x){
        this.daysLeft = x;
    }
    
    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }
    
    @Override
    public void work(){
        if(this.daysLeft > 0){
        this.daysLeft -= 1;
        }
    }
}
