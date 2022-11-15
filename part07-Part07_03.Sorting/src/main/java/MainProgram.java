import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {6, 8, 5, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println(MainProgram.indexOfSmallest(array));
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        int[] numbersSwap = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbersSwap));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbersSwap));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbersSwap));

        int[] numbersToSort = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbersToSort);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int search : array) {
            if (smallest > search) {
                smallest = search;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int value = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int value = table[startIndex];
        int index = startIndex;

        for (int i = index; i < table.length; i++) {
            if (table[i] < value) {
                value = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int storeFirst = array[index1];
        array[index1] = array[index2];
        array[index2] = storeFirst;
    }

    public static void sort(int[] array) {
        int index = 0;
        for (int nextOne : array) {
            MainProgram.swap(array, MainProgram.indexOfSmallestFrom(array, index), index);
            System.out.println(Arrays.toString(array));
            index++;
        }
    }
}
