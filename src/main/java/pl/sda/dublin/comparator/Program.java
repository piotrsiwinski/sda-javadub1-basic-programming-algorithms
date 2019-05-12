package pl.sda.dublin.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Person janek = new Person("jan", "kowalski", 20);
        Person adam = new Person("adam", "adamiak", 30);
        Person ala = new Person("ala", "nowak", 40);

        List<Person> osoby = new ArrayList<>();
        osoby.add(janek);
        osoby.add(adam);
        osoby.add(ala);

        // dlaczego nie dziala?
//        Collections.sort(osoby);

    }
}
