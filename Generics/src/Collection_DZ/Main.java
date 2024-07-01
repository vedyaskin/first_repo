/**
 * 1.Создайте ArrayList, содержащий разные цвета,
 * тип элемента этого динамического массива – String.
 * Напишите метод для поиска элемента в списке массивов.
 * На вход метод принимает параметр поиска. Например,
 * если список содержит «red», «blue», «green» и в
 * аргументы метода передать «red», то метод должен
 * вернуть true, символизируя то, что этот цвет содержится в списке.
 * <p>
 * 2.Создайте LinkedList, содержащий целые числа, т.е. Integer.
 * Напишите метод, который меняет местами первый и последний
 * элементы этого списка и возвращает этот список в новом виде.
 * Т.е., если создали список [1, 2, 3, 4, 5], то в результате
 * должны получить [5, 2, 3, 4, 1].
 */
package Collection_DZ;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
public class Main {

    // объявляем переменные типа ArrayList и LinkedList
    static ArrayList<String> colorList = new ArrayList<>();
    static LinkedList<Integer> intList = new LinkedList<>();

    public static void main(String[] args) {

        // заносим данные в списки
        colorList.add("red");
        colorList.add("green");
        colorList.add("blue");

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        // вызываем первый метод
        System.out.println( "Результа работы первого метода: " + searchElement( "green") );

        // находим первый и последний индекс второго списка
        int start = intList.indexOf( intList.getFirst() );
        int end =  intList.indexOf( intList.getLast() );

        System.out.println("Исходный список: " + intList );
        System.out.println("Конечный список: " + changeElemen( start, end ));
    }
    //метод для поиска элемента в списке массивов
    static boolean searchElement(String color) {

        return colorList.contains( color );
    }
    //метод, который меняет местами первый и последний элементы
    static LinkedList<Integer> changeElemen( int start, int end ){
        Collections.swap(intList, start , end);
        return intList;
    }
}
