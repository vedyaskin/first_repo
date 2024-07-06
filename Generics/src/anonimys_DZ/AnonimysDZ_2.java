package anonimys_DZ;
/**
 * Написать функциональный интерфейс Concationble с методом concat(),
 * который объединяет две строковых переменных, передаваемых в параметры метода и
 * возвращает строку.
 * В классе с методом main создать несколько анонимных классов
 * с различными реализациями метода concat().
 */
public class AnonimysDZ_2 {
    public static void main(String[] args) {
        //несколько анонимных классов с различными реализациями метода concat()
        Concationble concatClassic = new Concationble() {
            @Override
            public String concat(String stringOne, String stringTwo) {
                return stringOne.concat(stringTwo);
            }
        };
        Concationble concatVersa = new Concationble() {
            @Override
            public String concat(String stringOne, String stringTwo) {
                return stringTwo.concat(stringOne);
            }
        };
        Concationble concatDelimeter = new Concationble() {
            @Override
            public String concat(String stringOne, String stringTwo) {
                return String.join(" ", stringOne, stringTwo);
            }
        };
        // вызов методов
        System.out.println( concatClassic.concat("Hello", "World!") );
        System.out.println( concatVersa.concat("Hello", "World!") );
        System.out.println( concatDelimeter.concat("Hello", "World!") );
    }

}
//функциональный интерфейс Concationble с методом concat()
@FunctionalInterface
interface Concationble{
    String concat(String stringOne, String stringTwo);
}