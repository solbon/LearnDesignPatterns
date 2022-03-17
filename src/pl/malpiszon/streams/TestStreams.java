package pl.malpiszon.streams;

import java.util.ArrayList;
import java.util.List;

public class TestStreams {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Bob", 30));
        list.add(new Person("Tom", 30));
        list.add(new Person("Greg", 30));
        list.forEach(p -> Person.builder()
                .name(p.getName())
                .age(39)
        );
        System.out.println(list);
    }


}
