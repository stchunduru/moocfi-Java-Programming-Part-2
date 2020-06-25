
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        
        JTextField one = new JTextField("0");
        one.setEnabled(false);
        JTextField two = new JTextField();
        
        container.setLayout(layout);
        container.add(one);
        container.add(two);
        
        container.add(JP(one, two));
    }
    
    public JPanel JP(JTextField one, JTextField two){
        JPanel panel = new JPanel(new GridLayout(1, 3));
        
        JButton plus = new JButton("+");
        
        
        JButton minus = new JButton("-");
        
        
        JButton z = new JButton("Z");
        z.setEnabled(false);
        
        EventListener elist = new EventListener(one, two, plus, minus, z);
        plus.addActionListener(elist);
        minus.addActionListener(elist);
        z.addActionListener(elist);
        
        panel.add(plus);
        panel.add(minus);
        panel.add(z);
        
        return panel;
    }
    

    public JFrame getFrame() {
        return frame;
    }
}
