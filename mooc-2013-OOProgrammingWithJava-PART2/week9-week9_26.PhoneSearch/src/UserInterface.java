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

public class UserInterface {
    private Scanner reader;
    private Phonebook book;
    
    public UserInterface(Scanner reader){
        this.reader = reader;
        this.book = new Phonebook();
    }
    
    public void start(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        while(true){
            System.out.println();
            System.out.print("command: ");
            String read = reader.nextLine();
            
            if(read.equals("1")){
                System.out.print("whose number: ");
                String name = reader.nextLine();
                System.out.print("number: ");
                String number = reader.nextLine();
                book.addPersonByNumber(name, number);  
                
            }else if(read.equals("2")){
                System.out.print("whose number: ");
                String name = reader.nextLine();
                String numbers = book.returnPersonNumbers(name);
                if(numbers.length() > 0){
                    System.out.println(numbers);
                }else{
                    System.out.println("  not found");
                }
                
            }else if(read.equals("3")){
                System.out.print("number: ");
                String number = reader.nextLine();
                String name = book.searchforPersonByNumber(number);
                if(name != null){
                    System.out.println("  "+ name);
                }else{
                    System.out.println("  not found");
                }
                
            }else if(read.equals("4")){
                System.out.print("whose address: ");
                String name = reader.nextLine();
                System.out.print("street: ");
                String street = reader.nextLine();
                System.out.print("city: ");
                String city = reader.nextLine();
                book.addPersonByAddress(name, street, city);
                
            }else if(read.equals("5")){
                System.out.print("whose information: ");
                String name = reader.nextLine();
                if(book.exists(name)){
                    String address = book.returnAddress(name);
                    String numbers = book.returnPersonNumbers(name);
                    if(address.length() > 0){
                        System.out.println("  address: " + address);
                    }else{
                        System.out.println("  address unknown");
                    }
                    if(numbers.length() > 0){
                        System.out.println("  phone numbers: \n" + numbers);
                    }else{
                        System.out.println("  phone number not found");
                    }
                }else{
                    System.out.println("not found");
                }
                
            }else if(read.equals("6")){
                System.out.print("whose information: ");
                String name = reader.nextLine();
                book.removeInfo(name);
                
            }else if(read.equals("7")){
                System.out.print("keyword (if empty, all listed): ");
                String word = reader.nextLine();
                
                List<Person> people = new ArrayList<Person>();
                people = book.sortedList();
                
                List<String> peoplelist = new ArrayList<String>();
                
                for(Person x : people){
                    String tol = "";
                    tol += " " + x.getName();
                    if(x.getAddress().length() > 0){
                        tol += ("\n  address: " + x.getAddress());
                    }else{
                        tol += ("\n  address unknown");
                    }
                    String numbers = "";
                    for(String num : x.getNumbers()){
                        for(String number : x.getNumbers()){
                            numbers += "   " + number + "\n";
                        }
                    }
                    if(numbers.length() > 0){
                        tol += ("\n  phone numbers: \n" + numbers);
                    }else{
                        tol += ("\n  phone number not found");
                    }
                    peoplelist.add(tol);
                }
                if(!word.equals("")){
                    int hold = 0;
                    for(String x : peoplelist){
                        if(x.contains(word)){
                            System.out.println(x);
                            hold += 1;
                        }
                    }
                    if(hold == 0){
                        System.out.println("not found");
                    }
                }else{
                    for(String x : peoplelist){
                            System.out.println(x);
                    }
                }
                
                
                
            }else if(read.equals("x")){
                break;
            }
        }
        
    }
 
    
}
