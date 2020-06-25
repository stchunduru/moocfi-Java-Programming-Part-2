
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> next = new HashMap<String, String>();
        
        next.put("matti", "mage");
        next.put("mikael", "mixu");
        next.put("arto", "arppa");
        
        System.out.println(next.get("mikael"));
        
    }

}
