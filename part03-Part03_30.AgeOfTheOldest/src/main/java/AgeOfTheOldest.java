import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] nmb = {};

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            //int greatest = 0;
            int number = Integer.valueOf(parts[1]);
            nmb[sum] = number;
            sum = sum + 1;

            /*for(int i = 0; i < parts.length; i++) {
                int number = Integer.valueOf(parts[1]);
                System.out.println(number);
                if (greatest < number) {
                    greatest = number;
                    sum = Integer.valueOf(parts[1]);
                }
            } 

            if (input.isEmpty() == true) {
                break;
            }
        }
        /* 
        int greatest = age.get(0);
        int number = 0;
        for(int i = 0; i < age.size(); i++) {
            number = age.get(i);
            if (greatest < number) {
                greatest = number;
            }
        } 

        int oldest = nmb[0];

        for (int i = 0; i < nmb.length; i++) {
            if (nmb[i] > oldest) {
                oldest = nmb[i];
            }
        }

        System.out.println("Age of the oldest: " + oldest);
    } */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userNames = new ArrayList<String>();
        ArrayList<Integer> userAges = new ArrayList<Integer>();

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.length() > 0) {
                String[] splitStringArray = userInput.split(",");
                userNames.add(splitStringArray[0]);
                userAges.add(Integer.parseInt(splitStringArray[1]));
            }

            if (userInput.equals("")) {
                break;
            }
        }
        int largest = userAges.get(0);
        
        for (int i = 0; i < userAges.size(); i++) {
            int number = userAges.get(i);
            if (largest < number) {
                largest = userAges.get(i);
            }

        }
        System.out.println("Age of the oldest: " + largest);
    }
}
