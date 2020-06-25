/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import reference.domain.Film;
import java.util.*;
import reference.domain.Rating;

/**
 *
 * @author Cruzer
 */
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> list;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.list = ratings;
    }
    
    @Override
    public int compare(Film a, Film b){
        int aavg = 0;
        for(Rating r: this.list.get(a)){
            aavg += r.getValue();
        }
        aavg /= this.list.get(a).size();
        
        int bavg = 0;
        for(Rating r: this.list.get(b)){
            bavg += r.getValue();
        }
        bavg /= this.list.get(b).size();
        
        return bavg - aavg;  
    }
    
    
}
