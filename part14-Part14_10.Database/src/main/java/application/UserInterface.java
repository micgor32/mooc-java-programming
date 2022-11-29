package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Listing the database contents");
                System.out.println(this.database.list());
            } else if (command.equals("2")) {
                addToDB();
            } else if (command.equals("3")) {
                markAsDone();
            } else if (command.equals("4")) {
                removeFromDB();
            }
        }

        System.out.println("Thank you!");
    }

    private void addToDB() throws SQLException {
        System.out.println("Adding a new todo");
        System.out.println("Enter name");
        String name = this.scanner.nextLine();
        System.out.println("Enter description");
        String desc = this.scanner.nextLine();
        this.database.add(new Todo(name, desc, false));
    }

    private void markAsDone() throws SQLException {
        System.out.println("Which todo should be marked as done (give the id)?");
        int idToMark = Integer.valueOf(this.scanner.nextLine());
        this.database.markAsDone(idToMark);
    }

    private void removeFromDB() throws SQLException {
        System.out.println("Which todo should be removed (give the id)?");
        int idToRemove = Integer.valueOf(this.scanner.nextLine());
        this.database.remove(idToRemove);
    }
}
