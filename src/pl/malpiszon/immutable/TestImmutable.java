package pl.malpiszon.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestImmutable {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        System.out.println(names);
        List<String> unmodifiableList = Collections.unmodifiableList(names);
        names.add("d");
        System.out.println(unmodifiableList);
    }
}
