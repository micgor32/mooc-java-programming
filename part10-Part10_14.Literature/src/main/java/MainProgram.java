import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, age));
        }
        
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        Collections.sort(books, comparator);
        for (Book book : books) {
            System.out.println(book);
        }
        //books.stream().sorted().forEach(book -> System.out.println(book.getName() + " (recommended for " + book.getAge() + " year-olds or older)"));
    }

}
