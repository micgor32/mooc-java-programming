import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employeesList;

    public Employees() {
        this.employeesList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employeesList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();

        while (iterator.hasNext()) {
            this.employeesList.add(iterator.next());
        }
    }

    public void print() {
        this.employeesList.stream().forEach(employee -> System.out.println(employee));
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employeesList.iterator();

        while(iterator.hasNext()) {
            Person nextToPrint = iterator.next();
            if (nextToPrint.getEducation() == education) {
                System.out.println(nextToPrint);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employeesList.iterator();

        while(iterator.hasNext()) {
            Person nextToPrint = iterator.next();
            if (nextToPrint.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
