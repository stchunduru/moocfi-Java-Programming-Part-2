/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cruzer
 */
import java.util.*;
public class JumperList {
    private List<Jumper> list;
    private int roundcount;
    
    public JumperList(){
        this.list = new ArrayList<Jumper>();
        roundcount = 1;
    }
    
    //Adds jumper
    public void add(String name){
        this.list.add(new Jumper(name));
    }
    
    //Calls jump method on all jumpers. Orders list by ascending for jump order;
    public void jump(){
        for(Jumper x : this.list){
            x.jump();
        }
        Collections.sort(this.list, Collections.reverseOrder());
    }
    
    public void roundIncrement(){
        this.roundcount += 1;
    }
    
    //Returns round number
    public int roundCount(){
        return this.roundcount;
    }
    
    
    // Prints jumpers round stats
    public void printJumpstats(){
        for(Jumper x : this.list){
            System.out.println("  " + x.getName());
            System.out.println("    length: " + x.getJump());
            System.out.println("    judge votes: " + x.getJudgeScores());
        }
    }
    
    //Prints jumpers in order of total points.
    public void printJumpers(){
        int x = 1;
        for(Jumper jumpman : this.list){
            System.out.println("    " + x + ". " + this.list.get((x-1)));
            x += 1;
        }
    }
    
    //Used for final results. Orders list by points descending
    public void printWinners(){
        Collections.sort(list);
        for(int x = 0; x < this.list.size(); x++){
            System.out.println((x+1) + "           " + this.list.get(x));
            System.out.println("            " + this.list.get(x).jumpLengths());
        }
    }
}
