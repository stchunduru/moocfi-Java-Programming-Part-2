package farmsimulator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BulkTank m = new BulkTank();
        m.addToTank(20.234);
        System.out.println(m.getVolume());
        double a = 0;
        a += 20.234;
        System.out.println(a);
    }
}
