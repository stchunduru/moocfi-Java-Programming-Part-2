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

public class Jumper implements Comparable<Jumper>{
    
    //List for judge scores and jump lengths
    private List<Integer> judges;
    private String name;
    private int score;
    private int jump;
    private List<Integer> jumplist;
    
    public Jumper(String name){
        this.name = name;
        this.score = 0;
        this.jump = 0;
        this.judges = new ArrayList<Integer>();
        this.jumplist = new ArrayList<Integer>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public int getJump(){
        return this.jump;
    }
    
    public List<Integer> getJudgeScores(){
        return this.judges;
    }
    
    //Creates random number between 60-120. Sets current jump to it. Adds it to jumplist.
    //Calls judge scores and score calculations.
    public void jump(){
        Random random = new Random();
        this.jump = random.nextInt(61) + 60;
        this.jumplist.add(this.jump);
        this.judges.clear();
        judgeScores();
        
        scoreCalc();
    }
    
    //Calculates score using only middle 3 numbers of judges
    //Preserves judge score list
    public void scoreCalc(){
        int a[] = new int[3];
        for(int x = 1; x < this.judges.size()-1; x++){
            a[(x-1)] = this.judges.get(x);
        }
        
        int sum = 0;
        for(int x : a){
            sum += x;
        }
        this.score += sum + this.jump;
    }
    
    // Creates string with jump lengths
    public String jumpLengths(){
        String out = "jump lengths: ";
        for(int x = 0; x < this.jumplist.size(); x++){   
            if(x != this.jumplist.size()-1){
                out += String.valueOf(this.jumplist.get(x)) + "m, ";
            }else{
                out += String.valueOf(this.jumplist.get(x)) + "m";
            }
        }
        return out;
    }
    
    //Creates judge scores
    private void judgeScores(){
        Random random = new Random();
        for(int x = 0; x < 5; x++){
            this.judges.add(random.nextInt(11)+10);
        }
        Collections.sort(judges);
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.score + " points)";
    }
    
    // Compares jumpers by scores for Collection.sort method
    @Override
    public int compareTo(Jumper other){
        return other.score - this.score;
    }
    
    

    
}
