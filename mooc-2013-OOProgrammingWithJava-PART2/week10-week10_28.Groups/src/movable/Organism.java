/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Cruzer
 */
public class Organism implements Movable{
    
    private int x;
    private int y;
    
    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "x: " + x + "; y: " + y;
    }
    
    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    public int hashCode(){
        return this.x + this.y;
    }
    
    public boolean equals(Object o){
        Organism other = (Organism) o;
        return (x == other.x && y == other.y);
    }
    
    
    
}
