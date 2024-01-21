import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Nursultan", "Orazgeldy", "Developer", 27045.78));
        people.add(new Student("Dairkhan", "Makhambetyly", 2.5));
        people.add(new Student("Yerkin", "Aldangar", 3.0));
        people.add(new Employee("Dias", "Mendyarov", "businessman", 50000.00));

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}