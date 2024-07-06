package Enum_DZ_2;

import java.util.ArrayList;

/**
 * В классе с методом main создать список объектов Person, состоящий не менее,
 * чем из 10 человек разного пола. Написать метод, возвращающий список объектов класса Person
 * в зависимости от введенного параметра пола, т.е. список мужчин или женщин.
 */
public class Main {
    static ArrayList<Person> person = new ArrayList<>();

    public static void main(String[] args) {

        // Создаем список объектов Person

        person.add(new Person("Иван", 18, Person.Gender.MALE));
        person.add(new Person("Петр", 22, Person.Gender.MALE));
        person.add(new Person("Мария", 19, Person.Gender.FEMALE));
        person.add(new Person("Анна", 25, Person.Gender.FEMALE));
        person.add(new Person("Сергей", 30, Person.Gender.MALE));
        person.add(new Person("Елена", 28, Person.Gender.FEMALE));
        person.add(new Person("Алексей", 35, Person.Gender.MALE));
        person.add(new Person("Ольга", 24, Person.Gender.FEMALE));
        person.add(new Person("Дмитрий", 27, Person.Gender.MALE));
        person.add(new Person("Наталья", 32, Person.Gender.FEMALE));

       // Вызываем метод, возвращающий список объектов класса Person
        System.out.println("Женщины");
        System.out.println( getListPerson ( person, Person.Gender.FEMALE));
        System.out.println("Мужчины");
        System.out.println( getListPerson ( person, Person.Gender.MALE));

    }
    //метод, возвращающий список объектов класса Person
    static ArrayList<Person> getListPerson (ArrayList<Person> person, Person.Gender gender){
        ArrayList<Person> filterPerson = new ArrayList<>();
        for ( Person p : person ){
            if ( p.gender == gender ){
                filterPerson.add( p );
            }
        }
        return filterPerson;
    }

}
