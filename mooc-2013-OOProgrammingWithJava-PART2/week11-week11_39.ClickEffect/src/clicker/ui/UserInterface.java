package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable{
    private JFrame frame;
    private PersonalCalculator calc;
    
    public UserInterface(PersonalCalculator calc){
        this.calc = calc;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2,1);
        container.setLayout(layout);
        
        JLabel countView = new JLabel("0");
        JButton countButton = new JButton("Click!");
        
        ClickListener listener = new ClickListener(this.calc, countView);
        countButton.addActionListener(listener);
        
        container.add(countView);
        container.add(countButton);
    }

    public JFrame getFrame() {
        return frame;
    }
}
