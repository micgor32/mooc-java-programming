
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        String name = scanner.nextLine();
        boolean res = false;

        for (int lst = 0; lst < list.size(); lst++ ) {
            if (!list.get(lst).equals(name)) {
                continue;
            } else if (list.get(lst).equals(name)) {
                //System.out.println(name + " was found!");
                res = true;
            }
        }

        if (res == true) {
            System.out.println(name + " was found!");
        } else if (res == false) {
            System.out.println(name + " was not found!");
        }
    }
}
