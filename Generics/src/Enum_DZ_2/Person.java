package Enum_DZ_2;

/**
 * Написать класс Person с полями имени(name), возраста(age).
 * Для определения пола Person создать enum Gender с соответствующими константами.
 * В классе с методом main создать список объектов Person, состоящий не менее,
 * чем из 10 человек разного пола. Написать метод, возвращающий список объектов класса Person
 * в зависимости от введенного параметра пола, т.е. список мужчин или женщин.
 */
public class Person {
    String name;
    Integer age;
    Gender gender;



    public Person(String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender.getGender() + '\'' +
                '}';
    }
    enum Gender {
        MALE("МУЖ"),
        FEMALE("ЖЕН");
        String gender;

        Gender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }
    }

}
