import java.util.*;
public class Main {

    public static void main(String[] args) {
          Hand hand1 = new Hand();
hand1.add( new Card(12,Card.HEARTS) ); 
Hand hand2 = new Hand();
hand2.add( new Card(3,Card.CLUBS) ); 
hand2.add( new Card(9,Card.CLUBS) );

        System.out.println(hand2.compareTo(hand1));
 
        
    }
}
