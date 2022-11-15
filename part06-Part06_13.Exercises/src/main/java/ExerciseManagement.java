import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> managementList;

    public ExerciseManagement() {
        this.managementList = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList <String> list = new ArrayList<>();

        for (Exercise exercise : managementList) {
            list.add(exercise.getName());
        }

        return list;
    }

    public void add(String add) {
        this.managementList.add(new Exercise(add));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise markExercise : managementList) {
            if (markExercise.getName().equals(exercise)) { 
                markExercise.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise compExercise : managementList) {
            if (compExercise.getName().equals(exercise)) {
                return compExercise.isCompleted();
            }
        }

        return false;
    }
}
