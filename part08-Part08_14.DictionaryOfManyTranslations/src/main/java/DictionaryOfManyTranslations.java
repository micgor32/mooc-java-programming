import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations{
    private HashMap<String, ArrayList<String>> list;

    public DictionaryOfManyTranslations() {
        this.list = new HashMap<>();
        //this.addWordToList = new ArrayList<>();
    }

    public void add(String word, String translation) {
        this.list.putIfAbsent(word, new ArrayList<>());
        this.list.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (!this.list.containsKey(word)) {
            return new ArrayList<>();
        }
        return this.list.get(word);
    }

    public void remove(String word)  {
        this.list.remove(word);
    }
}