
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sq = Integer.valueOf(scanner.nextLine());
        int sq1 = Integer.valueOf(scanner.nextLine());
        double sum = Math.sqrt(sq + sq1);
        System.out.println(sum);
    }
}
