package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure object;
    
    public UserInterface(Figure object){
        this.object = object;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard board = new DrawingBoard(this.object);
        container.add(board);
        frame.addKeyListener(new KeyboardListener(board, object));
    }

    private void addListeners() {
    }

    public JFrame getFrame() {
        return frame;
    }
}
