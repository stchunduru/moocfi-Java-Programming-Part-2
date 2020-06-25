/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Cruzer
 */
public class DrawingBoard extends JPanel{
    private Figure object;
    
    public DrawingBoard(Figure object){
        this.object = object;
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        object.draw(g);
    }
    
    
    
}
