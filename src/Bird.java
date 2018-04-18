public class Bird {
    
    private final String name;
    private final String latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public void observation() {
        this.observations++;
    }
    
    public String name() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
    
}
