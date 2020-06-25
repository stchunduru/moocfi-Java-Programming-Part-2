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
public class UserInterface {
    private Scanner reader;
    private JumperList list;
    
    public UserInterface(Scanner reader){
        this.reader = reader;
        this.list = new JumperList();
    }
    
    public void participants(){
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; "
                + "an empty string brings you to the jumping phase.");
        
        while(true){
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if(name.length() > 0){
                this.list.add(name);
            }else{
                break;
            }
            
        }
    }
    
    public void contest(){
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println();
        
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            if(reader.nextLine().equals("jump")){
                System.out.println("");
                System.out.println("Round " + this.list.roundCount());
                System.out.println("");
                System.out.println("Jumping order: ");
                this.list.printJumpers();
                this.list.jump();
                System.out.println("");
                System.out.println("Results of round " + this.list.roundCount() + ": ");
                this.list.roundIncrement();
                this.list.printJumpstats();
                System.out.println("");
                
            }else{
                System.out.println("");
                System.out.println("Thanks!");
                break;
            }
        }
        
    }
    
    public void results(){
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        this.list.printWinners();
        
        
    }
    
}
