package dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private HashMap<String, String> reversedDictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.reversedDictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
        this.reversedDictionary.putIfAbsent(translation, words);

    }

    public String translate(String word) {
        String toReturn = this.dictionary.getOrDefault(word, null);

        if (toReturn == null) {
            toReturn = this.reversedDictionary.getOrDefault(word, null);
        }

        return toReturn;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            String value = this.dictionary.get(word);
            this.reversedDictionary.remove(value);
            this.dictionary.remove(word);
        }

        if (this.reversedDictionary.containsKey(word)) {
            String value = this.reversedDictionary.get(word);
            this.dictionary.remove(value);
            this.reversedDictionary.remove(word);
        } 
    }

    public boolean load() {
        try {
            Scanner file = new Scanner(Paths.get(this.file));
            while(file.hasNextLine()) {
                String line = file.nextLine();
                String[] parts = line.split(":");
                
                this.add(parts[0], parts[1]);
            }

            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String word : this.dictionary.keySet()) {
                writer.println(toFile(word));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    private String toFile(String key) {
        return key + ":" + this.dictionary.get(key);
    }
}