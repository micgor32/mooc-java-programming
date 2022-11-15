
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            String [] lst = text.split(" ");
            if (text.isEmpty() == true) {
                break;
            }           

            for (int i = 0; i < lst.length; i++) {
                if (lst[i].contains("av")) {
                    System.out.println(lst[i]);
                }
            }
        }
        scanner.close();
    }
}
