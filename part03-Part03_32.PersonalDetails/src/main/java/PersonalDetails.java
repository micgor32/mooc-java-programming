
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

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
        //int oldest = String.valueOf(name));
        int longest = name.get(0).length();
        //System.out.println(name.get(0));
        int index = 0;
        int sum = 0;
        for (int i = 0; i < age.size(); i++) {
            sum = sum + age.get(i);
            int nmb = name.get(i).length();
            if (longest < nmb) {
                longest = name.get(i).length();
                index = i;
            } 

            //if ()
        }
        System.out.println("Longest name: " + name.get(index));
        System.out.println("Average of the birth years: " + ((double) sum / age.size()));
    }
}