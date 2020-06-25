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
public class Box extends Figure{
    private int width;
    private int height;
    
    public Box(int x, int y, int w, int h){
        super(x, y);
        this.width = w;
        this.height = h;
    }
    
    public void draw(Graphics g){
        g.fillRect(getX(), getY(), width, height);
    }
    
}
