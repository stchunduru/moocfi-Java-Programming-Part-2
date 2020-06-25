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
public class Square extends Figure{
    private int diameter;
    
    public Square(int x, int y, int diameter){
        super(x, y);
        this.diameter = diameter;
    }
    
    public void draw(Graphics graphics){
        graphics.fillRect(getX(), getY(), diameter, diameter);
    }
    
    
}
