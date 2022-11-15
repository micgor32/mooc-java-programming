
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scan.nextLine();
        
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double dblnumber = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean val = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + dblnumber);
        System.out.println("You gave the boolean " + val);
    }
}
