
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int howMany = Integer.valueOf(scanner.nextLine());

        random(howMany);
    }

    public static void random(int howManyTimes) {
        Random number = new Random();

        for (int i = 0; i < howManyTimes; i++) {
            int randomNumber = number.nextInt(11);
            System.out.println(randomNumber);
        }        
    }
}
