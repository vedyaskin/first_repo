package Stream_DZ;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс Person с полями name и age.
 * В классе с методом main создать список, состоящий не менее,
 * чем из 10 объектов класса Person с произвольными данными.
 * Отфильтровать и вывести в консоль объекты Person,
 * возраст которых более 30 лет.
 */
public class Stream_DZ_2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Вася", 17));
        persons.add(new Person("Петя", 27));
        persons.add(new Person("Саша", 47));
        persons.add(new Person("Света", 33));
        persons.add(new Person("Юля", 17));
        persons.add(new Person("Маша", 37));
        persons.add(new Person("Костя", 47));

        persons.stream()
                // фильтруем
                .filter(e -> e.age > 30)
                // выводим на экран
                .forEach(e -> System.out.println(e.name + " " + e.age) );
    }
}
//todo класс Person с полями name и age.

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
