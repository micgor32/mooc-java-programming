
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String row;
        int number = 0;
        while (true) {
            row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }

            number = Integer.valueOf(row);
            number = number * number * number;
            System.out.println(number);
        }
    }
}
