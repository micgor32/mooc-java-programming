import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> age = new ArrayList<Integer>();

        while (true) {
            String inp = scanner.nextLine();

            if (inp.length() > 0) {
                String [] lst = inp.split(",");
                name.add(lst[0]);
                age.add(Integer.valueOf(lst[1]));
            } else {
                break;
            }
        } 
        int oldest = age.get(0);
        int index = 0;
        for (int i = 0; i < age.size(); i++) {
            int nmb = age.get(i);
            if (oldest < nmb) {
                oldest = age.get(i);
                index = i;
                //System.out.println(name.get(i));
            }
        }    
        System.out.println("Name of the oldest: " + name.get(index));
    }
}
