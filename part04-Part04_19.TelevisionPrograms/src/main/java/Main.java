import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int duration = 0;
        int maxDuration = 0;
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Duration: ");
            duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.println("Program's maximum duration? ");
        maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram mmn: programs) {
            if (mmn.getDuration() <= maxDuration){
                System.out.println(mmn.getName() + ", " + mmn.getDuration() + " minutes");
            }
        }
    }
}