package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        PersonalCalculator pcalc = new PersonalCalculator();
        UserInterface ui = new UserInterface(pcalc);
        SwingUtilities.invokeLater(ui);
    }
}
