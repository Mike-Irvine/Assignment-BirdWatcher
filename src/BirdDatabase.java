import java.util.ArrayList;

public class BirdDatabase {
    
    // Initialise ArrayList of Bird objects
    private final ArrayList<Bird> birds = new ArrayList<Bird>();

    public BirdDatabase() {
    }
    
    // Add new Bird to ArrayList, pass parameters 
    public void add(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }
    
    // Loop through Bird objects in ArrayList and call observation method of first Bird with name matching received user input (observed)
    // Return true or false to notify main.observation whether matching Bird was found
    public boolean observation(String observed) {
        for (Bird bird : birds) {
            if (bird.name().equals(observed)) {
                bird.observation();
                return true;
            }
        }
        return false;
    }
    
    // Loop through Bird objects in ArrayList and print
    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    // Loop through Bird objects in ArrayList and print first Bird with name matching received user input (search)
    // Return true or false to notify main.show whether matching Bird was found
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
