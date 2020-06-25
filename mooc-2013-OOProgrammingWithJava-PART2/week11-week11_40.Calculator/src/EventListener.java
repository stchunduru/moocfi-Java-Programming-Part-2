
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cruzer
 */
public class EventListener implements ActionListener{
    
    private JTextField in;
    private JTextField out;
    private JButton plus;
    private JButton minus;
    private JButton z;
    
    public EventListener(JTextField out, JTextField in, JButton plus, JButton minus, JButton z){
        this.in = in;
        this.out = out;
        this.plus = plus;
        this.minus = minus;
        this.z = z;
    }
    
    public void actionPerformed(ActionEvent E){
        try{
            if(E.getSource() == z){
                this.in.setText("");
                this.out.setText("0");
                
                this.z.setEnabled(false);
            }else{
                
            
                int input = Integer.parseInt(this.in.getText());
                int output = Integer.parseInt(this.out.getText());
            
                if(E.getSource() == plus){
                    this.out.setText(Integer.toString(output+input));
                }else if(E.getSource() == minus){
                    this.out.setText(Integer.toString(output-input));
            
                }
                if(this.out.getText().equals("0")){
                    this.z.setEnabled(false);
                }else{
                    this.z.setEnabled(true);
                }
                
                this.in.setText("");
            }
        }catch(Exception e){
            this.in.setText("");
        }
        
        
    }
    
    
}
