package pl.malpiszon.serialization;

import java.io.*;

public class TestSerialization {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Bob", 30);
        FileOutputStream fos = new FileOutputStream("person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);

        FileInputStream fis = new FileInputStream("person.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person personObj = (Person) ois.readObject();
        System.out.println(personObj);

    }
}
