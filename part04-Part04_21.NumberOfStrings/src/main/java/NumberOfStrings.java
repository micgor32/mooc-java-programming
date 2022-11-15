
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String row;
        int amount = 0;
        while (true) {
            row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }

            amount = amount + 1;
        }
        System.out.println(amount);
    }
}
