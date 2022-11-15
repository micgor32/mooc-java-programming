
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String pwd = scan.nextLine();
        String pwn = "Caput Draconis";

        if (pwd.equals(pwn)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        } 
    }
}