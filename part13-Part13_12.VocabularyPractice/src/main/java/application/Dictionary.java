package application;

import java.util.HashMap;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String,String>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
    }

    public String get(String word) {
        return this.dictionary.get(word);
    }

    public String getRandom() {
        Random random = new Random();
        List<String> tempList = new ArrayList<String>(this.dictionary.keySet());
        String toReturn = tempList.get(random.nextInt(tempList.size()));
        return toReturn;
    }
}
