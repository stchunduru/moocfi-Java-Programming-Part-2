
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }
    
    public String getregCode(){
        return this.regCode;
    }
    
    public String getCountry(){
        return this.country;
    }

    @Override
    public String toString(){
        return country + " " + regCode;
    }
    
    @Override
    public boolean equals(Object a){
        if (a == null) {
            return false;
        }
        if (getClass() != a.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) a;
        
        if(this.getCountry() == null || !this.getCountry().equals(compared.getCountry())){
            return false;
        }
        
        if (this.getregCode() == null || !this.getregCode().equals(compared.getregCode())) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.getregCode() == null || this.getCountry() == null) {
            return 5;
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }
        
}


