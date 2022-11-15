
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String fileName;
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        try (Scanner readfile = new Scanner(Paths.get(fileName))) {  
            while (readfile.hasNextLine()) {
                String content = readfile.nextLine();

                System.out.println(content);
            }
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();       
    }
}
