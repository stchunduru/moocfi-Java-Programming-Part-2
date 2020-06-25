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
    private Plane planes;
    private Flights flights;
    
    public UserInterface(){
        reader = new Scanner(System.in);
        this.planes = new Plane();
        this.flights = new Flights();
    }
    
    public void airPanel(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        
        while(true){
            
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String choice = reader.nextLine();
        
            if(choice.equals("1")){
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int weight = Integer.parseInt(reader.nextLine());
                planes.addPlane(planeID, weight);
                
            }else if(choice.equals("2")){
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String depID = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String desID = reader.nextLine();
                String plane = planes.getPlane(planeID);
                flights.addFlight(plane, depID, desID);
             
            }else if(choice.equals("x")){
                System.out.println();
                break;
            }
        }
    }
    
   
    public void flightPanel(){
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            
            String input = reader.nextLine();
            if(input.equals("1")){
                planes.printPlanes();
            }else if(input.equals("2")){
                flights.printFlights(planes);
            }else if(input.equals("3")){
                System.out.print("Give plane ID: ");
                String planename = reader.nextLine();
                System.out.println(planes.getPlane(planename));
            }else if(input.equals("x")){
                break;
            }
        }
        
    }
}
