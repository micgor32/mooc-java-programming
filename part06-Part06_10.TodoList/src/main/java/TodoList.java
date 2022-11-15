import java.util.Scanner;
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        int index = 0; 
        //int taskNumber = 1;
        for (int i = 0; i < this.todoList.size(); i++) {
            System.out.println((index + 1) + ": " + this.todoList.get(index));
            index++;
            //taskNumber++;
        }
        //this.index = this.index + taskNumber;
    }

    public void remove(int number) {
        this.todoList.remove(number - 1);
    }
}