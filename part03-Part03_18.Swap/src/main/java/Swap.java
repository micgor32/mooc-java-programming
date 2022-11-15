
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them

        int numbersToSwap[] = new int[2];
        System.out.println("Give two indices to swap:");
        numbersToSwap[0] = Integer.valueOf(scanner.nextLine());
        numbersToSwap[1] = Integer.valueOf(scanner.nextLine());
        
        int temp = array[numbersToSwap[0]];
        array[numbersToSwap[0]] = array[numbersToSwap[1]];
        array[numbersToSwap[1]] = temp;

        /*for (int i = 0; i < array.length; i++) {
            if (array[i] == numbersToSwap[0]) {
                array[i] = numbersToSwap[1];
            } else if (array[i] == numbersToSwap[1]) {
                array[i] = numbersToSwap[0];
            }
        } */

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
