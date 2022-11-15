
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Storage> archive = new ArrayList<>();
        //Storage storage = new Storage(id, name);
        while (true) {
            System.out.println("Identifer? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Storage storage = new Storage(id, name);
            if (!(archive.contains(storage))) {
                archive.add(storage);
            }
        }
        System.out.println("==Items==");
        for (Storage e : archive) {
            System.out.println(e);
        }
    }
}
