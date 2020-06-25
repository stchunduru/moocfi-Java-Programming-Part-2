package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.length() == 0 || (name.length() > 40)){
            throw new IllegalArgumentException("Try again: name");
        }else if(!(age >=0 && age <= 120)){
            throw new IllegalArgumentException("Try again: age");
        }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
