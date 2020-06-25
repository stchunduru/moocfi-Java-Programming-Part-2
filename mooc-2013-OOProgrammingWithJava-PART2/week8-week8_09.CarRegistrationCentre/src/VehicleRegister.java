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
public class VehicleRegister {
    
    private Map<RegistrationPlate, String> list;
    
    public VehicleRegister(){
        
        this.list = new HashMap<RegistrationPlate, String>();
    }
    
    public String get(RegistrationPlate plate){
        return this.list.get(plate);
    }
    
    public boolean add(RegistrationPlate p, String o){
        if(!this.list.containsKey(p)){
            this.list.put(p, o);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean delete(RegistrationPlate plate){
        for(RegistrationPlate x : this.list.keySet()){
            if (x.equals(plate)){
                this.list.remove(x);
                return true;
            }
        }
        return false;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate x: this.list.keySet()){
            System.out.println(x);
        }
    }
    
    public void printOwners(){
        List<String> arr = new ArrayList<String>();
        for(String x : this.list.values()){
            if(!arr.contains(x)){
                arr.add(x);
            }
        }
        for(String x : arr){
            System.out.println(x);
        }
    }
}
