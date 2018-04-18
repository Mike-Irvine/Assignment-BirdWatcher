import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        // initialise Scanner and BirdDatabase
        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdDB = new BirdDatabase();
        String input;
        
        // input loop
        while (true) {
            // Basic request and capture of user input
            System.out.print("? ");
            input = scanner.nextLine();
            
            // End program
            if (input.equals("Quit")) {
                break;
            }
            // Pass all other inputs to handleCommand method
            handleCommand(scanner, birdDB, input);
        }
    }
    
    public static void handleCommand(Scanner scanner, BirdDatabase birdDB, String input) {
        // Pass recognised inputs to appropriate handling method
        if (input.equals("Add")) {
            add(scanner, birdDB);
        } else if (input.equals("Observation")) {
            observation(scanner, birdDB);
        } else if (input.equals("Statistics")) {
            statistics(birdDB); // no further user input required for Statistics command, no scanner passed to method
        } else if (input.equals("Show")) {
            show(scanner, birdDB);
        } else {
            System.out.println("Is not a recognised command!"); // Any unrecognised command prints a standard message
        }
    }
    
    public static void add(Scanner scanner, BirdDatabase birdDB) {
        // Request and capture of user inputs
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin name: ");
        String latinName = scanner.nextLine();
        // Pass user inputs to add method of BirdDatabase to create a new entry
        birdDB.add(name, latinName);
    }
    
    public static void observation(Scanner scanner, BirdDatabase birdDB) {
        // Request and capture user input
        System.out.print("What was observed:? ");
        String observed = scanner.nextLine();
        // Pass user input to observation method of BirdDatabase
        if (!birdDB.observation(observed)) {
            System.out.println("Is not a bird!"); // Print standard message if input doesn't match existing entry
        }
    }
    
    public static void statistics(BirdDatabase birdDB) {
        // Statistics method of BirdDatabase prints names and observation counts of all existing entries
        birdDB.statistics();
    }
    
    public static void show(Scanner scanner, BirdDatabase birdDB) {
        // Request and capture user input
        System.out.print("What? ");
        String search = scanner.nextLine();
        // Pass user input to show method of BirdDatabase which prints names and observation count of matching entry
        if (!birdDB.show(search)) {
            System.out.println("Is not a bird!"); // Print standard message if input doesn't match existing entry
        }
    }
}
