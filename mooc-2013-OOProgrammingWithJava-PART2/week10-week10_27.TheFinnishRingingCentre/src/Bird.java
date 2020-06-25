
public class Bird{

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    
    public String getName(){
        return this.name;
    }
    public String getLatinName(){
        return this.latinName;
    }
    
    public int getYear(){
        return this.ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public int hashCode(){
        return this.ringingYear + this.latinName.hashCode();
    }
    
    @Override
    public boolean equals(Object o){
        Bird other = (Bird) o;
        return (this.latinName.equals(other.latinName) && 
                this.ringingYear == (other.ringingYear));
    }
    
}


