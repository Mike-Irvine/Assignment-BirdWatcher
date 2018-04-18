import java.util.ArrayList;

public class BirdDatabase {
    
    private final ArrayList<Bird> birds = new ArrayList<Bird>();

    public BirdDatabase() {
    }
    
    public void add(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }
    
    public boolean observation(String observed) {
        for (Bird bird : birds) {
            if (bird.name().equals(observed)) {
                bird.observation();
                return true;
            }
        }
        return false;
    }
    
    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public boolean show(String search) {
        for (Bird bird : birds) {
            if (bird.name().equals(search)) {
                System.out.println(bird);
                return true;
            }
        }
        return false;
    }
}
