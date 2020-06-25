/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;
import java.util.*;

public class Player {
    private Random random = new Random();
    private int height;
    private int length;
    private int dx;
    private int dy;

    public Player(int height, int length){
        this.length = length;
        this.height = height;
        this.dx = 0;
        this.dy = 0;
    }

    public int getX(){
        return this.dx;
    }

    public int getY(){
        return this.dy;
    }

    //Moves player, as long as it is in bounds of map.
    public void move(String key){
        if(key.equals("w")){
            if(this.dx > 0){
                this.dx -= 1;
            }
        }else if(key.equals("a")){
            if(this.dy > 0){
                this.dy -= 1;
            }
        }else if(key.equals("s")){
            if(this.dx < height-1){
                this.dx += 1;
            }
        }else if(key.equals("d")){
            if(this.dy < length-1){
                this.dy += 1;
            }
        }
    }

    public String toString(){
        return "@ " + this.dy + " " + this.dx;
    }
}

