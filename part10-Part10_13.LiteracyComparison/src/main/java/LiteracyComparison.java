import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Data> list = getData("literacy.csv");
        list.stream().sorted().forEach(e -> System.out.println(e));
    }

    public static List<Data> getData (String file) {
        List<Data> data = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).map(row -> row.split(",")).map(parts -> new Data(parts[3], Integer.valueOf(parts[4]), parts[2].trim(), Double.valueOf(parts[5]))).forEach(string -> data.add(string));
        } catch (Exception err) {
            System.out.println("Error: " + err.getMessage());
        }

        return data;
    }
}