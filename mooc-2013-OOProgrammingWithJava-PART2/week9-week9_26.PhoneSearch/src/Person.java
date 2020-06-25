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

public class Person implements Comparable<Person>{
    private String name;
    private Set<String> numbers;
    private String address;
    
    public Person(String name){
        this.name = name;
        this.numbers = new HashSet<String>();
        this.address = "";
    }
    
    public String getName(){
        return this.name;
    }
    
    public Set<String> getNumbers(){
        return this.numbers;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void addNumber(String number){
        this.numbers.add(number);
    }
    
    public void addAddress(String a){
        this.address = a;
    }
   
    
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    @Override
    public boolean equals(Object o){
        Person compared = (Person) o;
        return name.equals(compared.name);
    }
    
    @Override
    public int compareTo(Person o){
        return this.name.compareToIgnoreCase(o.name);
    }
    
    
}
