/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cruzer
 */
public class Change {
    private char a;
    private char b;
    
    public Change(char a, char b){
        this.a = a;
        this.b = b;
    }
    
    public String change(String x){
        String next = "";
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == this.a){
                next += this.b;
            }else{
                next += x.charAt(i);
            }
        }
        return next;
    }
}
