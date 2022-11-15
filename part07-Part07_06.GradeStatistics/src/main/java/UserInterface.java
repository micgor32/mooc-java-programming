import java.util.Scanner;

public class UserInterface {
    private Calculate points;
    private Scanner scanner;
    
    public UserInterface(Calculate points, Scanner scanner) {
        this.points = points;
        this.scanner = scanner;
    }

    public void start() {
        readInput();
        System.out.println("Point average (all): " + this.points.averageOfPoints());
        this.points.averageOfPassingGrades();
        System.out.println("Pass percentage: " + this.points.passPercentage());
        this.points.printGradeDistribution();
    }

    public void readInput() {
        while (true) {
            System.out.println("Enter points total, -1 stops:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                break;
            } else if (userInput < -1 || userInput > 100) {
                // If providen number is outside range 0-100, ignore it and ask for another one.  
                continue;
            }

            this.points.addPoints(userInput);
            this.points.addGradeBasedOnPoints(userInput);
        }
    }
}
