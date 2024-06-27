package Nestedinner_DZ;

public class Main {
    public static void main(String[] args){
        Car honda = new Car("Honda", 200, 2000);
        System.out.println("Марка: " + honda.carBrand);
        System.out.println("Максимальная скорость: " + honda.speed);
        System.out.println("Масса: " + honda.weight);
        System.out.println();
        honda.start();
        System.out.println();
        honda.stop();
    }
}
