/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;
import java.util.*;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;
/**
 *
 * @author Cruzer
 */
public class RatingRegister {
    
    private Map<Film, List<Rating>> list;
    private Map<Person, Map<Film,Rating>> plist;
    
    public RatingRegister(){
        this.list = new HashMap<Film, List<Rating>>();
        this.plist = new HashMap<Person, Map<Film,Rating>>();
    }
    
    public void addRating(Film name, Rating rate){
        if(list.containsKey(name)){
            list.get(name).add(rate);
        }else{
            List<Rating> o = new ArrayList<Rating>();
            o.add(rate);
            list.put(name, o);
        }
    }
    
    public void addRating(Person person, Film name, Rating rate){
        if(plist.containsKey(person)){
            plist.get(person).put(name, rate);
            addRating(name,rate);
        }else{
            Map<Film,Rating> vote = new HashMap<Film,Rating>();
            vote.put(name, rate);
            plist.put(person, vote);
            addRating(name,rate);
        }
        
    }
    
    public Rating getRating(Person person, Film name){
        if(plist.containsKey(person)){
            if(plist.get(person).containsKey(name)){
                return plist.get(person).get(name);
            }else{
                return Rating.NOT_WATCHED;
            }
        }
        return Rating.NOT_WATCHED;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(!plist.containsKey(person)){
            return new HashMap<Film,Rating>();
        }
        return plist.get(person);
    }
    
    public List<Person> reviewers(){
        List<Person> people = new ArrayList<Person>();
        for(Person p: plist.keySet()){
            people.add(p);
        }
        return people;
    }
    
    public List<Rating> getRatings(Film name){
        if(list.containsKey(name)){
            return list.get(name);
        }
        return null;
    }
    
    
    
    public Map<Film, List<Rating>> filmRatings(){
        return list;
    }
    
    
}
