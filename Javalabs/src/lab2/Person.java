package lab2;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        } else {
            Person person = (Person) o;
            return Objects.equals(age, person.age) && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
