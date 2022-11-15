import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scanner = new Scanner(System.in);

        //System.out.println("string: ");
        //String inp = scanner.nextLine();
        boolean val = new Checker().allVowels("aaa");
        System.out.println(val);
    }
}
