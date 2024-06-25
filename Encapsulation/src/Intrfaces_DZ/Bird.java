package Intrfaces_DZ;

public class Bird implements Swimmable, Flyable{
    boolean waterfowl, // указывает водоплавающая птица или нет
            flying; // указывает летающая птица или нет
    String species; // порода птицы

    public Bird(String species, boolean waterfowl, boolean flying) {
        this.species = species;
        this.waterfowl = waterfowl;
        this.flying = flying;
    }

    @Override
    public void fly() {
        if ( flying ) {
            System.out.println("Умеет летать.");
        }
        else System.out.println("Не умеет летать.");
    }

    @Override
    public void swim() {
        if ( waterfowl ) System.out.println( "Водоплавающая птица.");
        else System.out.println( "Не водоплавающая птица." );
    }
}
