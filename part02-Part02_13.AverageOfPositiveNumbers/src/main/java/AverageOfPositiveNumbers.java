
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int runs = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                sum = sum + number;
                runs = runs + 1;
            }
        }
        if (runs == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((sum / runs));
        }
        scanner.close();
    }
}
