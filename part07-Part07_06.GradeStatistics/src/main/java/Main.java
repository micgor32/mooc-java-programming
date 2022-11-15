import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculate list = new Calculate();

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }
}
