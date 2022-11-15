import java.util.ArrayList;
import java.util.Scanner;


public class UserInteface {
    private Scanner scanner;
    private BirdsBase birdsList;

    public UserInteface(Scanner scanner) { // add second argument later on
        this.scanner = scanner;
        this.birdsList = new BirdsBase();
        //this.obList = new ArrayList<>();
    }

    public void start() {
        //ArrayList<Birds> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String input = this.scanner.nextLine();

            if (input.equals("Add")) {
                uiAddBird();
            } else if (input.equals("Observation")) {
                System.out.println("Bird?");
                String birdToObserve = this.scanner.nextLine();
                this.birdsList.addObs(birdToObserve);
            } else if (input.equals("All")) {
                this.birdsList.printBirds();
            } else if (input.equals("One")) {
                System.out.println("Bird?");
                String birdToPrint = this.scanner.nextLine();
                this.birdsList.printSpecBird(birdToPrint);
            } else if (input.equals("Quit")) {
                break;
            } else {
                System.out.println("No such command");
                continue;
            }
        }
    }

    private void uiAddBird() {
        System.out.println("Name:");
        String name = this.scanner.nextLine();
        System.out.println("Name in Latin:");
        String latName = this.scanner.nextLine();
        this.birdsList.addBird(new Birds(name, latName));
    }
}
