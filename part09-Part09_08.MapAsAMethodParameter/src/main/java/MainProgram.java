import java.util.Map;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object

    /*private static int returnSize(Map<String, String> list) {
        int size = 0;

        for (String key : list.keySet()) {
            size++;
        }

        return size;
    }*/
    public static int returnSize(Map map) {

        return map.size();

    }
}
