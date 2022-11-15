
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a numbers:");
        int sum = 0;
        int nn = 0;
        double nm = 0;
        int checkOdd = 0;
        int odd = 0;
        int even = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + nn);
                System.out.println("Average: " + (sum / nm));
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            } else {
                sum = sum + number;
                nn++;
                nm++;

                checkOdd = number % 2;
                if (checkOdd == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        scanner.close();
    }
}