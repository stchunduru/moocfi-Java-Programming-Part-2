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

public class Phonebook{
    private Set<Person> list;
    
    public Phonebook(){
        this.list = new HashSet<Person>();
    }
    
    //checks if person exists
    public boolean exists(String name){
        for(Person x: this.list){
            if (x.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    //also adds number to existing person
    public void addPersonByNumber(String name, String number){
        this.list.add(new Person(name));
        for(Person x : this.list){
            if(x.getName().equals(name)){
                x.addNumber(number);
            }
        }
    }
    
    //also adds/changes address for existing person
    public void addPersonByAddress(String name, String a, String b){
        this.list.add(new Person(name));
        String address = a + " " + b;
        for(Person x : this.list){
            if(x.getName().equals(name)){
                x.addAddress(address);
            }
        }
    }
    
    //gives back all numbers related to person
    public String returnPersonNumbers(String name){
        String numbers = "";
        for(Person x : this.list){
            if(x.getName().equals(name)){
                for(String number : x.getNumbers()){
                    numbers += "   " + number + "\n";
                }
            }
        }
        return numbers;
    }
    
    //return person associated to number
    public String searchforPersonByNumber(String number){
        for(Person x : this.list){
            if(x.getNumbers().contains(number)){
                return x.getName();
            }
        }
        return null;
    }
    
    //returns address related to person
    public String returnAddress(String name){
        for(Person x : this.list){
            if(x.getName().equals(name)){
                return x.getAddress();
            }
        }
        return null;
    }
    
    //deletes person info
    public void removeInfo(String name){
        Person test = new Person(name);
        if(this.list.contains(test)){
            this.list.remove(test);
        } 
    }
    
    public List<Person> sortedList(){
        ArrayList<Person> person = new ArrayList<Person>();
        for(Person x : this.list){
            person.add(x);
        }
        Collections.sort(person);
        return person;
    }
    
   
}
    

