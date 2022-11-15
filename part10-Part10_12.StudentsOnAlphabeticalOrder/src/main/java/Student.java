

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student name) {
        if (name.getName().equals(this.name)) { 
            return 0;
        }

        return this.name.compareTo(name.getName());
    }
}
