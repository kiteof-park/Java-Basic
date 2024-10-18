package javajungsuk.ch11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("의연짱");
        set.add("의연짱");

        set.add(new Person("Euiyeon", 29));
        set.add(new Person("Euiyeon", 29));
        System.out.println(set);
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: %s, age: %d".formatted(name, age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)) return false;
        Person person = (Person)obj;
        return name.equals(person.name) && age == person.age;
    }
}
