import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookInfo = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String title;
        int pages = 0;
        int year = 0;

        while (true) {
            System.out.println("Title:");
            title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages:");
            pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            year = Integer.valueOf(scanner.nextLine());

            bookInfo.add(new Book(title, pages, year));
            
        }
        String output;
        System.out.println("What information will be printed?");
        output = scanner.nextLine();

        if (output.equals("everything")) {
            for (Book eve : bookInfo) {
                System.out.println(eve.getTitle() + ", " + eve.getPages() + " pages, " + eve.getYear());
            }
        } 
        if (output.equals("name")) {
            for (Book nme : bookInfo) {
                System.out.println(nme.getTitle());
            }
        }
    }
}