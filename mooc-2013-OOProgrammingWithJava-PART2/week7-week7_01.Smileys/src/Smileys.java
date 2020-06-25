
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        //printWithSmileys("Method");
        //printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String x){
        String a ="";
        if(x.length() % 2 == 0){
            a = ":) " + x + " :)";
        }else{
            a = ":) " + x + "  :)";
        }
        int len = a.length();
        
        for(int y = 0; y < len/2; y++){
            System.out.print(":)");
        }
        System.out.println("");
        System.out.println(a);
        
        for(int y = 0; y <= len/2 -1; y++){
            System.out.print(":)");
        }  
    }

}
