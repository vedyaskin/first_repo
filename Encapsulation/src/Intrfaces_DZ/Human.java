package Intrfaces_DZ;

public class Human implements Swimmable, Flyable {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Может плавать техникой брасс");
    }

    @Override
    public void fly() {
        System.out.println("Может летать на самолете");
    }
}
