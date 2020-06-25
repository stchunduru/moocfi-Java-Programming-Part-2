/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;
import java.awt.Graphics;

/**
 *
 * @author Cruzer
 */
public abstract class Figure {
    private int dx;
    private int dy;
    
    public Figure(int x, int y){
        this.dx = x;
        this.dy = y;
    }
    
    public int getX() {
        return dx;
    }

    public int getY() {
        return dy;
    }
    
    public void move(int x, int y){
        dx += x;
        dy += y;
    }
    
    public abstract void draw(Graphics graphics);

}
