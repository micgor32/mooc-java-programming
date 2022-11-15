
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int runs = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                System.out.println("Number of numbers: " + runs);
                System.out.println("Sum of the numbers: " + sum);
                break;
            } else {
                sum = sum + number;
                runs = runs + 1;
            }
        }
        scanner.close();
    }
}
