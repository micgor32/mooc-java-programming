
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int runs = 0;
        //double erg;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                //erg = sum / runs;
                System.out.println("Average of the numbers: " + (sum / runs));
                break;
            } else {
                sum = sum + number;
                runs = runs + 1;
            }
        }
        scanner.close();
    }
}