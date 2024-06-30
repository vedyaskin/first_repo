package Generic_DZ;

/**
 * 1.Напишите метод, который принимает два массива одного типа
 * и проверяет, содержат ли они одинаковые элементы
 * в одном и том же порядке.
 *
 * 2.Напишите универсальный метод,
 * чтобы обмениваться позициями двух
 * различных элементов в массиве.
 */
import java.util.Arrays;
public class Gen_dz {
    public static void main(String[] args) {

    // Создаем несколько массивов
        String[] array1 = { "один", "два", "три"};
        String[] array2 = {"три", "два", "один"};
        Integer[] array3 = {1,2,3,4};
        Integer[] array4 = {1,2,3,4};

       // Вызываем первый метод
        compareArray (array3, array4);
        compareArray(array1,array2);
        System.out.println();

        // Вызываем второй метод
        changeIndex(array1, 0, 2);
    }

   // 1. метод, который принимает два массива одного типа
   // и проверяет, содержат ли они одинаковые элементы
   // в одном и том же порядке.

    static <T> void compareArray (T[] arrayOne, T[] arrayTwo){
        if ( Arrays.equals(arrayOne, arrayTwo) ) {
            System.out.println("Массивы равны.");
        } else {
            System.out.println("Массивы не равны");
        }
    }

    // универсальный метод, чтобы обмениваться позициями двух
    // различных элементов в массиве.
    static <T> void changeIndex ( T[] array, int indexOne, int indexTwo ){
        T temp;
        try{
            System.out.println( "Исходный массив: " + Arrays.toString(array) );
            temp = array[indexOne];
            array[indexOne] = array[indexTwo];
            array[indexTwo] = temp;
            System.out.println( "Конечный массив: " + Arrays.toString(array) );
        } catch (Exception e) {
            System.out.println("Количество элементов в массиве " + array.length );
            System.out.println("Индекс введен не верно.");
        }
    }
}
