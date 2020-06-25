package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(400,200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
    }

    public void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        
        ButtonGroup group1 = new ButtonGroup();
        group1.add(yes);
        group1.add(no);
        
        container.add(yes);
        container.add(no);
        
        container.add(new JLabel("Why?"));
        JRadioButton none = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        
        ButtonGroup group2 = new ButtonGroup();
        group2.add(none);
        group2.add(fun);
        
        container.add(none);
        container.add(fun);
        
        JButton but = new JButton("Done!");
        container.add(but);
    }

    public JFrame getFrame() {
        return frame;
    }
}
