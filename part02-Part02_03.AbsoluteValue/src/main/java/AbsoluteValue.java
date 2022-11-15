
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nm = Integer.valueOf(scanner.nextLine());
        if (nm < 0) {
            System.out.println(nm * -1);
        } else {
            System.out.println(nm);
        }
    }
}
