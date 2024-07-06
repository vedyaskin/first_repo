import java.util.Arrays;

public class Array {
    /**
     * 1.Дан массив целых чисел int[] array = {3, 87, 12, 98, 2, 4, 66}.
     * Вывести в консоль элементы массива в обратном порядке, т.е. начиная с 66.
     *
     * 2.Дан произвольный массив чисел с плавающей точкой.
     * Необходимо отсортировать его по убыванию.
     * 3. Дан массив целых чисел int[] array = {6, 117, 44, 5, 32, 81, 9}.
     * Необходимо вывести в консоль четные элементы массива.
     */
    public static void main(String[] args) {
        // Задание 1.======================================
        int[] arrayInt = {3, 87, 12, 98, 2, 4, 66};
        for ( int i = ( arrayInt.length - 1 ); i >= 0 ; i--){
            System.out.print( arrayInt[i] + " " );
        }
        System.out.println();

        // Задание 2.=========================================
        double[] arrayDouble = {3.14, 87.45, 12.789, 98.55, 2.78, 4.69, 66.85};
        double temp;
        for ( int i = 0; i < arrayDouble.length; i++){
            for (int j = 0; j < arrayDouble.length; j++){
                if ( arrayDouble[i] > arrayDouble[j] ){
                    temp = arrayDouble[i];
                    arrayDouble[i] = arrayDouble[j];
                    arrayDouble[j] = temp;
                }
            }
        }
        for ( double i : arrayDouble){
            System.out.print( i + " ");
        }
        // Задание 3.===============================================
        System.out.println();
        int[] array = {6, 117, 44, 5, 32, 81, 9};
        for ( int i : array ){
            if ( (i % 2) == 0 ){
                System.out.print( i + " ");
            }
        }
    }
}
