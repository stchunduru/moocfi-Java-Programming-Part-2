/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.*;

public class Vampire {
    private Random random = new Random();
    private int height;
    private int length;
    private int dx;
    private int dy;

    public Vampire(int h, int l){
        this.height = h;
        this.length = l;

        this.dx = random.nextInt(height);
        this.dy = random.nextInt(length);
        startPositions();
    }

    public Vampire(int h, int l, int x, int y){
        this.height = h;
        this.length = l;
        this.dx = x;
        this.dy = y;
    }

    //Spawns vampire in place not 0,0
    public void startPositions(){
        while(dx == 0 && dy == 0){
            this.dx = random.nextInt(height);
            this.dy = random.nextInt(length);
        }
    }

    public int getX(){
        return this.dx;
    }

    public int getY(){
        return this.dy;
    }

    public void setX(int x){
        this.dx = x;
    }

    public void setY(int y){
        this.dy = y;
    }

    //If vampire moves out of the map, it is reverted to original position.
    public void move(){
        int holdx = this.dx;
        int holdy = this.dy;
        this.dx += random.nextInt(2+1)-1;
        this.dy += random.nextInt(2+1)-1;
        if(this.dx < 0 || this.dx > height -1 || this.dy < 0 || this.dy > length -1){
            this.dx = holdx;
            this.dy = holdy;
        }
    }


    public String toString(){
        return "v " + this.dy + " " + this.dx;
    }
    
    //Used for checking vampire collision.
    @Override
    public int hashCode(){
        return this.dx + this.dy;
    }

    @Override
    public boolean equals(Object other){
        Vampire o = (Vampire) other;
        return (this.dx == o.dx && this.dy == o.dy);
    }


}
