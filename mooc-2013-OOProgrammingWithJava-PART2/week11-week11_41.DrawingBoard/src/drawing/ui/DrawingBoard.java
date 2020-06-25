package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
        
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(100, 50, 50, 50);
        graphics.fillRect(250, 50, 50, 50);
        
        graphics.fillRect(40, 200, 50, 50);
        graphics.fillRect(280, 200, 50, 50);
        
        graphics.fillRect(90, 250, 190, 50);

        
    }
}
