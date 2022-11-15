
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            String [] lst = text.split(" ");
            if (text.isEmpty() == true) {
                break;
            }           

            System.out.println(lst[lst.length - 1]);
        }
        scanner.close();

    }
}
