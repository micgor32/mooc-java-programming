
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int inp = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= inp; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
