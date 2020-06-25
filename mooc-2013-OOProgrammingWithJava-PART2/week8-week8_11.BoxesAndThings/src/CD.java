/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cruzer
 */
public class CD implements ToBeStored{
    
    private String title;
    private String artist;
    private int publishingYear;
    private double weight;
    
    public CD(String artist, String title, int publishingYear){
        this.title = title;
        this.artist = artist;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }
    
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
    
    public double weight(){
        return this.weight;
    }
}
