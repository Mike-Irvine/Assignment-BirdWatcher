import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdDB = new BirdDatabase();
        String input;
        
        while (true) {
            System.out.print("? ");
            input = scanner.nextLine();
            
            if (input.equals("Quit")) {
                break;
            }
            handleCommand(scanner, birdDB, input);
        }
    }
    
    public static void handleCommand(Scanner scanner, BirdDatabase birdDB, String input) {
        if (input.equals("Add")) {
            add(scanner, birdDB);
        } else if (input.equals("Observation")) {
            observation(scanner, birdDB);
        } else if (input.equals("Statistics")) {
            statistics(birdDB);
        } else if (input.equals("Show")) {
            show(scanner, birdDB);
        } else {
            System.out.println("Is not a recognised command!");
        }
    }
    
    public static void add(Scanner scanner, BirdDatabase birdDB) {
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin name: ");
        String latinName = scanner.nextLine();
        birdDB.add(name, latinName);
    }
    
    public static void observation(Scanner scanner, BirdDatabase birdDB) {
        
        System.out.print("What was observed:? ");
        String observed = scanner.nextLine();
        if (!birdDB.observation(observed)) {
            System.out.println("Is not a bird!");
        }
    }
    
    public static void statistics(BirdDatabase birdDB) {
        
        birdDB.statistics();
    }
    
    public static void show(Scanner scanner, BirdDatabase birdDB) {
        
        System.out.print("What? ");
        String search = scanner.nextLine();
        if (!birdDB.show(search)) {
            System.out.println("Is not a bird!");
        }
    }
}
