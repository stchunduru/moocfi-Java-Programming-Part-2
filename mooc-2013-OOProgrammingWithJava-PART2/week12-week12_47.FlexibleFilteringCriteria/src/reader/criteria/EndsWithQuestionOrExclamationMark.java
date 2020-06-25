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
public class EndsWithQuestionOrExclamationMark implements Criterion{
    
    public boolean complies(String line){
        if(line.length() > 0){
            return line.charAt(line.length()-1) == '?' || line.charAt(line.length()-1) == '!';
        }else{
            return false;
        }
           
    }
    
}
