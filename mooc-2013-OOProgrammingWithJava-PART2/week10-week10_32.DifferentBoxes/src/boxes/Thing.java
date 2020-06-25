package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if(weight < 0){
            throw new IllegalArgumentException("NOOO");
        }else{
            this.name = name;
            this.weight = weight;
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
    
    @Override
    public boolean equals(Object thing){
        Thing other = (Thing) thing;
        return (this.name.equals(other.name));
    }
    
    

}
