public class Bird {
    
    private final String name;
    private final String latinName;
    private int observations;
    
    // Construct Bird with received parameters and no current observations
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    // Increment observation count of this instance
    public void observation() {
        this.observations++;
    }
    
    // Return name of this instance
    public String name() {
        return this.name;
    }
    
    // Return all information for this instance in the form: Name (LatinName): # observations
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
}
