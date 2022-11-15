
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int plus = first + second;
        int minus = first - second;
        int mn = first * second;
        double div = Double.valueOf(first) / Double.valueOf(second);
        System.out.println(first + " + " + second + " = " + plus);
        System.out.println(first + " - " + second + " = " + minus);
        System.out.println(first + " * " + second + " = " + mn);
        System.out.println(first + " / " + second + " = " + div);
    }
}
