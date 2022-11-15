public class Person {
    private String name;
    private Education eduStage;

    public Person (String name, Education eduStage) {
        this.name = name;
        this.eduStage = eduStage;
    }

    public String getName() {
        return this.name;
    }

    public Education getEducation() {
        return this.eduStage;
    }

    public String toString() {
        return this.name + ", " + this.eduStage;
    }
}
