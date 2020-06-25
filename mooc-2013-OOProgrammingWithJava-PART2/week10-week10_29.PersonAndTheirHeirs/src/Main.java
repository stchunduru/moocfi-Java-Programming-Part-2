
import java.util.*;
import people.Person;
import people.Student;
import people.Teacher;



public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        Teacher one = new Teacher("Bill", "Woll street", 5400);
        list.add(new Student("Jack", "Piol street"));
        list.add(new Student("Mace", "Bank street"));
        printDepartment(list);
        System.out.println(one.getName());
    }
    
    public static void printDepartment(List<Person> list){
        for(Person x: list){
            System.out.println(x);
        }
    }
}
