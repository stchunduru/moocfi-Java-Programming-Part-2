/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;
import java.util.*;
import wormgame.Direction;

/**
 *
 * @author Cruzer
 */
public class Worm {
    private int ox;
    private int oy;
    private int length;
    private Direction dir;
    private List<Piece> list;
    
    public Worm(int ox, int oy, Direction direction){
        this.ox = ox;
        this.oy = oy;
        this.dir = direction;
        this.length = 3;
        
        this.list = new ArrayList<Piece>();
        this.list.add(new Piece(ox,oy));
    }
    
    public Direction getDirection(){
        return this.dir;
    }
    
    public void setDirection(Direction dir){
        this.dir = dir;
    }
    
    public int getLength(){
        return getPieces().size();
    }
    
    public List<Piece> getPieces(){
        return this.list;
    }
    
    public void move(){
        if(this.dir == Direction.LEFT){
            this.list.add(new Piece(head().getX()-1, head().getY()));
        }else if(this.dir == Direction.RIGHT){
            this.list.add(new Piece(head().getX()+1, head().getY()));
            
        }else if(this.dir == Direction.UP){
            this.list.add(new Piece(head().getX(), head().getY() -1));
        }else if(this.dir == Direction.DOWN){
            this.list.add(new Piece(head().getX(), head().getY()+1));
        }
        
        if(list.size() > length){
            this.list.remove(0);
        }
        
    }
    
    public void grow(){
        if(list.size() > 2){
            length += 1;
        }
    }
    
    public boolean runsInto(Piece o){
        for(Piece x : this.list){
            if(x.getX() == o.getX() && x.getY() == o.getY()){
                return true;
            }
        }
        return false;
    }
    
    
    
    public boolean runsIntoItself(){
        if(this.list.size() > 2){
            for(int x = 0; x < this.list.size()-1; x++){
                 if(head().getX() == this.list.get(x).getX() && 
                         head().getY() == this.list.get(x).getY()){
                    return true;
                }
            }
        }
        return false;
    }
    
    public Piece head(){
        return this.list.get(getLength()-1);
        
    }
    
    
    
}
