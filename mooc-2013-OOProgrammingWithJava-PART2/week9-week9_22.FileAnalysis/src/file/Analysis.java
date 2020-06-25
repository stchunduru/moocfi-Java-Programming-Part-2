/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;
import java.util.*;
/**
 *
 * @author Cruzer
 */
public class Analysis {
    private File file;
    
    public Analysis(File file) throws Exception{
        this.file = file;
    }
    
    public int lines() throws Exception{
        int count = 0;
        Scanner reader = new Scanner(this.file);
        while(reader.hasNextLine()){
            count += 1;
            reader.nextLine();
        }
        return count;
    }
    
    public int characters() throws Exception{
        int count = 0;
        Scanner reader = new Scanner(this.file);
        while(reader.hasNextLine()){
            count += reader.nextLine().length() + 1;
        }
        return count;
    }
    
}
