/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;
import java.util.*;
/**
 *
 * @author Cruzer
 */
public class Employees {
    private List<Person> list;
    
    public Employees(){
        this.list = new ArrayList<Person>();
    }
    
    public void add(Person p){
        this.list.add(p);
    }
    
    public void add(List<Person> lisg){
        this.list.addAll(lisg);
    }
    
    public void print(){
        for(Person x : this.list){
            System.out.println(x);
        }
    }
    
    public void print(Education level){
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation() == level){
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education level){
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getEducation() == level){
                iterator.remove();
            }
        }
    }
    
}
