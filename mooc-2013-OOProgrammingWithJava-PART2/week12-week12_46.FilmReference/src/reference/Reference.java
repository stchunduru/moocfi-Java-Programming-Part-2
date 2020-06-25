/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;
import java.util.*;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Cruzer
 */
public class Reference {
    private RatingRegister register;
    
    public Reference(RatingRegister rating){
        this.register = rating;
    }
    
    
    public Film recommendFilm(Person name){
        //If Person name did not watch anything, recommend highest rated movie.
        if(register.getPersonalRatings(name).isEmpty()){
            List<Film> films = new ArrayList<Film>(register.filmRatings().keySet());
            Collections.sort(films, new FilmComparator(register.filmRatings()));
            return films.get(0);
            
        }else{
            //Finds out if someone has similar tastes
            Person buddy = getSimilar(name);
            
            //Finds top reviewed movie, unwatched by Person name. If none, return null.
            if(buddy != null){
                Film x = null;
                for(Film p : register.getPersonalRatings(buddy).keySet()){
                    if(!register.getPersonalRatings(name).keySet().contains(p)){
                        if(register.getRating(buddy, p).getValue() > 0){
                            if(x != null){
                                if(register.getRating(buddy, x).getValue() < register.getRating(buddy, p).getValue()){
                                    x = p;
                                }
                            }else{
                                x = p;
                            }
                        }
                    }
                }
                return x;
            }
        }
        return null;
    }
    
    //Gets person with most similar tastes. If none, return null.
    public Person getSimilar(Person name){
        int max = 0;
        Person buddy = null;
        for(Person p : register.reviewers()){
            if(p.equals(name)){
                continue;
            }
            int count = 0;
            for(Film x : register.getPersonalRatings(p).keySet()){
                if(register.getPersonalRatings(name).containsKey(x)){
                    count += register.getPersonalRatings(name).get(x).getValue() * 
                            register.getPersonalRatings(p).get(x).getValue();
                }
            }
            if(count > max){
                max = count;
                buddy = p;
            }
        }
        return buddy;
    }
}
