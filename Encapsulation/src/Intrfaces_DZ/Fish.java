package Intrfaces_DZ;

public class Fish implements Swimmable, Flyable{
    String species;
    boolean canSwim, // указывает умеет ли рыба плавать или нет
                        // (есть одна рыба, котрая не умеет плавать, она ходит по дну)
            flying; // указывает летающая рыба или нет

    public Fish(String species, boolean canSwim, boolean flying) {
        this.species = species;
        this.canSwim = canSwim;
        this.flying = flying;
    }
    @Override
    public void fly() {
        if ( flying ) System.out.println( "Умеет летать." );
        else System.out.println( "Не умеет летать.");
    }
    @Override
    public void swim() {
        if ( canSwim ) System.out.println( "Умеет плавать." );
        else System.out.println( "Не умеет плавать.");
    }
}
