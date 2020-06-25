/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Cruzer
 */
public class Not implements Criterion{
    private Criterion a;
    
    public Not(Criterion a){
        this.a = a;
    }
    
    public boolean complies(String line){
        return (!a.complies(line));
    }
    
    
}
