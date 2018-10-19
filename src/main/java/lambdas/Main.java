package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    interface  PersonFactory <P extends  Person> {
        P create(String firstName, String lastname);
    }

    public static void main(String[] args) {
        PersonFactory<Person> personPersonFactory = Person::new;
        Person pers = personPersonFactory.create("Name","Surname");
        System.out.println(pers.firstName + " " + pers.lastName);


        List<String> strings = new ArrayList<>();
        strings.add("a1");

        strings.stream().filter(s->s.contains("a")).forEach(System.out::println);
    }
}
