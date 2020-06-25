
public class Main {

    public static void main(String[] args) {
        System.out.println(clockTime("24:41:16"));
    }
    
    public static boolean isAWeekDay(String day){
        return (day.matches("mon|tue|wed|thu|fri|sat|sun"));
    }
    
    public static boolean allVowels(String word){
        return word.matches("[aeiouäöy]*");
    }
    
    public static boolean clockTime(String word){
        return word.matches("([0-1][0-4]|[0-2][0-3]):[0-5][0-9]:[0-5][0-9]");
    }
}
