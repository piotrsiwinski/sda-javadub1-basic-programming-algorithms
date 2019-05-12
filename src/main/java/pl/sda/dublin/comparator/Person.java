package pl.sda.dublin.comparator;

public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public int compareTo(Person otherPerson) {
        // 1. porownywanie po nazwisku:
//        return this.surname.compareTo(otherPerson.surname);


        // 2. po wieku (I wersja)
        if(this.age < otherPerson.age){
            return -1;
        } else if (this.age == otherPerson.age){
            return 0;
        }else {
            return 1;
        }

        // 3. po wieku 2 wersja - bardziej elegacnka: mozemy rowniez wykorzystac metode z klasy Integer:
//        return Integer.compare(this.age, otherPerson.age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

