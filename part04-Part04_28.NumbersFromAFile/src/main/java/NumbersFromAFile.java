
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int amount = 0;

        try (Scanner newFile = new Scanner(Paths.get(file))) {
            while (newFile.hasNextLine()) {
                int number = Integer.valueOf(newFile.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    amount++;
                }
            }
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        /*for (int y = 0; y < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        } */
        System.out.println("Numbers: " + amount);
    }

}
