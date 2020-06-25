/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Cruzer
 */
public class ClickListener implements ActionListener{
    private PersonalCalculator calc;
    private JLabel label;
    
    public ClickListener(PersonalCalculator calc, JLabel label){
        this.calc = calc;
        this.label = label;
    }
    
    public void actionPerformed(ActionEvent e){
        this.calc.increase();;
        this.label.setText(Integer.toString(this.calc.giveValue()));
    }
    
}
