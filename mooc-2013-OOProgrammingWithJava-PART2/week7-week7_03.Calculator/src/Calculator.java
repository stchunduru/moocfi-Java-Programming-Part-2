/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cruzer
 */
import java.util.*;
public class Calculator {
    private Reader reader;
    private int calcs;
    public Calculator(){
        this.reader = new Reader();
        this.calcs = 0;
    }
    
      public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }
      
      private void sum(){
          System.out.println("Value1: ");
          int x = reader.readInteger();
          System.out.println("Value2: ");
          int y = reader.readInteger();
          System.out.println("Sum of the values " + (x + y));
          this.calcs += 1;
      }
      
      private void difference(){
          System.out.println("Value1: ");
          int x = reader.readInteger();
          System.out.println("Value2: ");
          int y = reader.readInteger();
          
          System.out.println("Difference of the values " + (x-y));
          this.calcs += 1;
      }
      
      private void product(){
          System.out.println("Value1: ");
          int x = reader.readInteger();
          System.out.println("Value2: ");
          int y = reader.readInteger();
          System.out.println("Product of the values " + (x * y));
          this.calcs += 1;
      }
      
      private void statistics(){
          System.out.println("Calculations done " + this.calcs);
      }
      
      
}
