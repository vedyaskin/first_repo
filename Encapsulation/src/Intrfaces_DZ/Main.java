package Intrfaces_DZ;

public class Main {
    public static void main ( String[] args ){

        Human vasya = new Human("Вася",25);
        System.out.println("Имя: " + vasya.name);
        vasya.fly();
        vasya.swim();

        System.out.println();

        Bird ostrich = new Bird("Страус",false, false);
        System.out.println( ostrich.species);
        ostrich.fly();
        ostrich.swim();

        System.out.println();

        Bird swan = new Bird("Лебедь", true,true);
        System.out.println( swan.species );
        swan.fly();
        swan.swim();

        System.out.println();

        Fish ogcocephalus = new Fish("Нетопырь короткорылый", false,false);
        System.out.println( ogcocephalus.species );
        ogcocephalus.swim();
        ogcocephalus.fly();

        System.out.println();

        Fish exocoetidae = new Fish("Летучая рыба", true, true);
        System.out.println(exocoetidae.species);
        exocoetidae.fly();
        exocoetidae.swim();
    }
}
