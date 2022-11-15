import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ing;

    public Recipe(String name, int cookingTime, ArrayList ing) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ing = ing;
    }

    public String getName(){
        return this.name;
    }

    public int getTime(){
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ing;
    }
}
