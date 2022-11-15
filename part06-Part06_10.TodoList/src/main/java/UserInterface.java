import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList list, Scanner scan) {
        this.scanner = scan;
        this.todoList = list;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String getUserInput = scanner.nextLine();
            if (getUserInput.equals("stop")) {
                break;
            } else if (getUserInput.equals("add")) {
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                this.todoList.add(toAdd);
            } else if (getUserInput.equals("list")) {
                this.todoList.print();
            } else if (getUserInput.equals("remove")) {
                System.out.println("Which one is removed?");
                int removed = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(removed);
            }
        }
    }
}
