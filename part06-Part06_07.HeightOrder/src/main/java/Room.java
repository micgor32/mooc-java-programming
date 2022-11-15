import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        }

        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person returnObject = this.persons.get(0);

        for (Person shortest : this.persons) {
            if (returnObject.getHeight() > shortest.getHeight()) {
                returnObject = shortest;
            }
        }

        return returnObject;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortPerson = shortest();
        this.persons.remove(shortPerson);
        return shortPerson;
    }
}
