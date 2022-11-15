
public class HealthStation {
    //private int lowestWeight;
    private int performed = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.performed++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int newWeight = Integer.valueOf(person.getWeight()) + 1;
        person.setWeight(newWeight);
    }

    public int weighings() {
        return this.performed;
    }
}
