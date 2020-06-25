/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;
import java.io.File;
import java.util.*;
/**
 *
 * @author Cruzer
 */
public class WordInspection {
    private File file;
    private List<String> lines;
    private Scanner reader;
    
    public WordInspection(File file) throws Exception{
        this.file = file;
        this.reader = new Scanner(this.file, "UTF-8");
    }
    
    public int wordCount(){
        int count = 0;
        while(reader.hasNextLine()){
            String [] x = reader.nextLine().split(" ");
            count += x.length;
        }
        return count;
    }
    
   
    public List<String> wordsContainingZ(){
        List<String> list = new ArrayList<String>();
        int count = 0;
        while(reader.hasNextLine()){
            String []x = reader.nextLine().split(" ");
            for(String word:x){
                if(word.contains("z")){
                    list.add(word);
                }
            }
        }
        return list;
    }
    
    public List<String> wordsEndingInL(){
        List<String> list = new ArrayList<String>();
        while(reader.hasNextLine()){
            String []x = reader.nextLine().split(" ");
            for(String word:x){
                if(word.charAt(word.length() - 1) == 'l'){
                    list.add(word);
                }
            }
        }
        return list;
    }
    
    public List<String> palindromes(){
        List<String> list = new ArrayList<String>();
        while(reader.hasNextLine()){
            String []x = reader.nextLine().split(" ");
            for(String word:x){
                String reverse = "";
                for(int i = word.length()-1; i >= 0; i--){
                    reverse += word.charAt(i);
                }
                if(reverse.equals(word)){
                    list.add(word);
                }
            }
        }
        return list;
    }
    
    public List<String> wordsWhichContainAllVowels(){
        List<String> chars = Arrays.asList("a","e","i","o","u","y","ä","ö");
        List<String> list = new ArrayList<String>();
        while(reader.hasNextLine()){
            String []x = reader.nextLine().split(" ");
            for(String word:x){
                int count = 0;
                for(int i = 0; i < chars.size(); i++){
                    if(word.contains(chars.get(i))){
                        count += 1;
                    }
                }
                if(count == 8){
                    list.add(word);
                }
            }
        }
        return list;
    }
    
}
