
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        //System.out.println("First: " + container1);
        //System.out.println("Second: " + container2);

        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            if (command.equals("add") && amount >= 0) {
                //if((container1.contains() >= container1.m)
                container1.add(amount);
            } else if (command.equals("move") && amount >= 0) {
                if ((container1.contains() - amount) >= 0) {
                    container2.add(amount);
                    container1.remove(amount);
                } else if ((container1.contains() - amount) < 0) {
                    container2.add(container1.contains());
                    container1.remove(amount);
                }
                /*if (container1.contains() > 0) {
                    container2.add(amount);
                    container1.remove(amount);
                } */
            } else if (command.equals("remove") && amount >= 0) {
                container2.remove(amount);
            }
        }
        System.out.println("First: " + container1);
        System.out.println("Second: " + container2);
    }
}
