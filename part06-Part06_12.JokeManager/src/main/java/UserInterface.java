import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String getUserInput = this.scanner.nextLine();

            if (getUserInput.equals("X")) {
                break;
            } else if (getUserInput.equals("1")) {
                System.out.println("Write the joke to be added:");
                String toAdd = this.scanner.nextLine();

                this.manager.addJoke(toAdd);
            } else if (getUserInput.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.manager.drawJoke());
            } else if (getUserInput.equals("3")) {
                System.out.println("Printing the jokes.");
                this.manager.printJokes();
            }
        }
    }
}
