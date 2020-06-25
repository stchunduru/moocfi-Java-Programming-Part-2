/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import reference.domain.Person;
import java.util.*;

/**
 *
 * @author Cruzer
 */
public class PersonComparator implements Comparator<Person>{
    private Map<Person, Integer> identities;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities){
        this.identities = peopleIdentities;
    }
    
    public int compare(Person a, Person b){
        return identities.get(b) - identities.get(a);
    }
    
    
    
}
