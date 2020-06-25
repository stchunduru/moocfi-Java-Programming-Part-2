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
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;
    
    public TextUserInterface(Scanner reader, Dictionary dict){
        this.reader = reader;
        this.dict = dict;
    }
    
    public void start(){
        System.out.println("Statement: ");
        System.out.println("    add - adds a word pair to the list");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the user interface");
        while(true){
            System.out.print("Statement: ");
            String entry = reader.nextLine();
            if(entry.equals("quit")){
                System.out.println("Cheers!");
                break;
            }else if(entry.equals("add")){
                System.out.print("In Finnish: ");
                String x = reader.nextLine();
                System.out.print("Translation: ");
                String y = reader.nextLine();
                this.dict.add(x, y);
            }else if(entry.equals("translate")){
                System.out.print("Give a word: ");
                String x = reader.nextLine();
                System.out.println("Translation: " + this.dict.translate(x));
            }
        }
    }
}
