
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5,6,7,8,9};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder a = new StringBuilder();
        a.append("{");
        
        for(int x = 0; x < t.length; x++){
            if(x % 4 == 0){
                a.append("\n ");
            }
            a.append(String.valueOf(t[x]));
            
            if(x != t.length -1){
                a.append(", ");
            }
        }
        
        a.append("\n}");
        
        return a.toString();
    }
}
