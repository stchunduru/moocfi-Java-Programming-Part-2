package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame();
        frame.setPreferredSize(new Dimension(400,200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField textAreaTop = new JTextField("The Copier");
        JLabel textAreaBottom = new JLabel();
        JButton copyButton = new JButton("Copy!");
        
        ActionEventListener listen = new ActionEventListener(textAreaTop,textAreaBottom);
        copyButton.addActionListener(listen);
        
        container.add(textAreaTop);
        container.add(copyButton);
        container.add(textAreaBottom);
        
        
    }
}
