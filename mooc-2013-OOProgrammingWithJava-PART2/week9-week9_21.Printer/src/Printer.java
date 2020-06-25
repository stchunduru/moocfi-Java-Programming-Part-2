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
import java.io.File;

public class Printer {
    private File file;
    
    
    public Printer(String file) throws Exception{
        
        this.file = new File(file);
        
    }
    
    public void printLinesWhichContain(String word) throws Exception{
        Scanner reader = new Scanner(this.file);
        while(reader.hasNextLine()){
            String x = reader.nextLine();
            if(x.contains(word)){
                System.out.println(x);
            }
        }
    }
}
