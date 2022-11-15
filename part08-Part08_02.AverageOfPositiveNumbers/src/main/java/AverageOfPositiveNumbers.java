
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int runs = 0;
        double sum = 0.0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0 ) {
                break;
            }
            
            if (input > 0) {
                sum += input;
                runs++;
            }
        }

        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println(sum / runs);
    }
}
