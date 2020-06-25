/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author Cruzer
 */
public class DrawingBoard extends JPanel implements Updatable{
    private WormGame game;
    private int pieceLength;
    
    
    public DrawingBoard(WormGame game, int pieceLength){
        this.game = game;
        this.pieceLength = pieceLength;
    }
    
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        for(Piece piece : game.getWorm().getPieces()) {
            graphics.setColor(Color.BLACK);
            graphics.fill3DRect(piece.getX() * pieceLength, piece.getY() * pieceLength, pieceLength, pieceLength, true);
        }

        graphics.setColor(Color.RED);
        graphics.fillOval(game.getApple().getX() * pieceLength, game.getApple().getY()* pieceLength, pieceLength, pieceLength);
    }
    
    public void update(){
        super.repaint();
    }
    
    
}
