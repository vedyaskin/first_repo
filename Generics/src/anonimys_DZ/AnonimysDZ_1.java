package anonimys_DZ;

/**
 * Написать функциональный интерфейс Printable с методом print().
 * В классе с методом main создать несколько анонимных классов с
 * различными реализациями метода print().
 */
public class AnonimysDZ_1 {
    public static void main(String[] args) {
    //создать несколько анонимных классов с
    // различными реализациями метода print().
        Printable printClass = new Printable() {
            @Override
            public void print(String string) {
                System.out.println("Результат метода в классе printClass: ");
                System.out.println(string);
            }
        };
        Printable printlnClass = new Printable() {
            @Override
            public void print(String string) {
                System.out.println("Результат метода в классе printlnClass: ");
                System.out.println(string.replace(" ", "\n"));
            }
        };
        Printable printfClass = new Printable() {
            @Override
            public void print(String string) {
                System.out.println("Результат метода в классе printfClass: ");
                System.out.printf("%36s%n", string);
            }
        };
        // вызываем методы в анонимных классах
        printClass.print("Hello World!");
        printlnClass.print("Hello World!");
        printfClass.print("Hello World!");
    }
}

// Написать функциональный интерфейс Printable с методом print().
@FunctionalInterface
interface Printable {
    void print(String string);
}
