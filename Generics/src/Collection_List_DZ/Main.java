/**
 * 1. Создайте два набора, хранящих в себе элементы строкового типа,
 * характеризующие цвет чего – либо.
 * Напишите метод для сравнения двух наборов и сохранения элементов,
 * которые одинаковы для обоих наборов.
 * 2. Создайте множество целых чисел. Необходимо вывести в консоль все его элементы,
 * которые больше 15 и являются четными. Остальные элементы набора тоже необходимо
 * вывести в консоль, но каждый из них разделив на 2
 */

package Collection_List_DZ;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    // ЗАДАНИЕ 1
   // Создайте два набора, хранящих в себе элементы строкового типа,
   // характеризующие цвет чего – либо
        HashSet<String> color = new HashSet<>();
        HashSet<String> color2 = new HashSet<>();
        color.add("красный");
        color.add("зеленый");
        color.add("синий");
        color.add("желтый");
        color.add("коричневый");

        color2.add("фиолетовый");
        color2.add("зеленый");
        color2.add("белый");
        color2.add("желтый");
        color2.add("черный");

// Напишите метод для сравнения двух наборов и сохранения элементов,
// которые одинаковы для обоих наборов.
        color2.retainAll(color);
        System.out.println( color );
        System.out.println( color2 );

 //=============================================================
        //ЗАДАНИЕ 2.
        //Создайте множество целых чисел.
        TreeSet<Integer> setOfInt = new TreeSet<>();
        for (int i = 0; i <= 100; i++){
            setOfInt.add(i);
        }
// Необходимо вывести в консоль все его элементы,
// которые больше 15 и являются четными.
        System.out.println( "Исходное множество: " + setOfInt );

        // Используем tailSet для получения элементов больше 15
        TreeSet<Integer> moreThan15  = new TreeSet<>();
        moreThan15 = (TreeSet<Integer>) setOfInt.tailSet(16);
        System.out.println("Элементы которые больше 15 и являются четными: ");
        for ( Integer num : moreThan15 ){
            if ( num % 2 == 0 ) System.out.print(num + " ");
        }
        System.out.println();

        // Используем headSet для получения остальных элементов
        TreeSet<Integer> lessThan15 = new TreeSet<>();
        lessThan15 =  (TreeSet<Integer>) setOfInt.headSet(16);
        System.out.println("Все остальные элементы: " );
        // Выводим элементы, которые меньше 16 и деленные на 2
        for (Integer num : lessThan15) {
            System.out.print( ( num / 2) + " ");

        }


    }
}
