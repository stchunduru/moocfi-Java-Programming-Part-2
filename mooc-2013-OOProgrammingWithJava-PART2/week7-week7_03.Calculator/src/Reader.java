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

public class Reader {
    private Scanner reader;
    
    public Reader(){
        this.reader = new Scanner(System.in);
    }
    
    public String readString(){
        String x = this.reader.nextLine();
        return x;
    }
    
    public int readInteger(){
        int x = Integer.parseInt(this.reader.nextLine());
        return x;
    }
}
