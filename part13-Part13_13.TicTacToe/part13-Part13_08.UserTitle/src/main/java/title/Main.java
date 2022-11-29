package title;

import java.util.Scanner;
import javafx.application.Application;
import title.UserTitle;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("set the title: ");
        String title = scanner.nextLine();

        Application.launch(UserTitle.class, "--title=" + title);
    }

}
