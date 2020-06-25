package movingfigure;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import movingfigure.DrawingBoard;
import movingfigure.Figure;

public class KeyboardListener implements KeyListener {

    private Component component;
    private Figure object;

    public KeyboardListener(Component board, Figure figure) {
        this.object = figure;
        this.component = board;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Keystroke " + e.getKeyCode() +  " pressed.");
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            object.move(-1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            object.move(1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            object.move(0, -1);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            object.move(0, 1);
        }
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}