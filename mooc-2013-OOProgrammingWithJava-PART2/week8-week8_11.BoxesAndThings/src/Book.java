/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cruzer
 */
public class Book implements ToBeStored{
    private String name;
    private String writer;
    private double weight;
    
    public Book(String writer, String name, double weight){
        this.name = name;
        this.writer = writer;
        this.weight = weight;
    }
    
    public String toString(){
        return this.writer + ": " + this.name;
    }
    
    public double weight(){
        return this.weight;
    }
    
     
    
}
