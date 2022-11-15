import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scan, SimpleDictionary word) {
        this.scanner = scan;
        this.simpleDictionary = word;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye, bye!");
                break;
            } else if (input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            } else if (input.equals("search")) {
                System.out.println("To be translated:");
                String toTranslation = scanner.nextLine();
                String translation = simpleDictionary.translate(toTranslation);
                if (translation == null) {
                    System.out.println("Word " + toTranslation + " was not found");
                } else {
                    System.out.println(simpleDictionary.translate(toTranslation));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
