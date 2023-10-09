package Streams;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Ahmed", 34,50000));
        personList.add(new Person("Shafiq", 27,40000));
        personList.add(new Person("Shihab", 49,70000));
        personList.add(new Person("Jannat", 51,100000));
        personList.add(new Person("Emdad", 22,20000));
        personList.add(new Person("Pranto", 25,30000));

        personList.stream().filter(n->n.getSalary()>=20000&&n.getSalary()<=40000)
                .forEach(person -> System.out.println(person.getName()));
    }
}