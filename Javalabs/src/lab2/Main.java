package lab2;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();

        Person person = new Person("William", "Nicholas", 25);
        Person person1 = new Person("WWilliam", "Niklas", 25);

        String jsonPerson = gson.toJson(person);

        System.out.println("Json:" + jsonPerson);

        Person deserializedPerson = gson.fromJson(jsonPerson, Person.class);

        System.out.println(person.toString());
        System.out.println(deserializedPerson.toString());

        boolean result = person.equals(deserializedPerson);
        System.out.println("result = " + result);
        System.out.println(person.toString() + " == " + person1.toString() + " = " + person.equals(person1));
        System.out.println(person.toString() + " == " + deserializedPerson.toString() + " = " + person.equals(deserializedPerson));
        System.out.println(person1.hashCode());
        System.out.println(person.hashCode());
        System.out.println(deserializedPerson.hashCode());

        System.out.println(person == deserializedPerson);
    }
}
