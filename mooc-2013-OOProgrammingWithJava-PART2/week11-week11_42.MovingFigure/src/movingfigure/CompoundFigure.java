/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;
import java.awt.Graphics;
import java.util.*;
/**
 *
 * @author Cruzer
 */
public class CompoundFigure extends Figure{
    private List<Figure> thing;
    
    public CompoundFigure(){
        super(0,0);
        this.thing = new ArrayList<Figure>();
    }
    
    public void add(Figure object){
        this.thing.add(object);
    }
    
    public void move(int x, int y){
        for(Figure fig: thing){
            fig.move(x, y);
        }
    }
    
    public void draw(Graphics g){
        for(Figure fig: thing){
            fig.draw(g);
        }
    }
    
    
}
