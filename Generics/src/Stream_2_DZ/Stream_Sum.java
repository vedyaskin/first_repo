package Stream_2_DZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Напишите программу для вычисления суммы всех четных
 * и нечетных чисел в списке с использованием потоков.
 */
public class Stream_Sum {
    public static void main(String[] args) {
        List<Integer> count = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int even =  count.stream().filter(e -> e % 2 == 0).reduce((x, y) -> x+y).get();
        System.out.println("Сумма четных чисел = " + even );

        int not_even = count.stream().filter(e -> e % 2 != 0).reduce((x, y) -> x+y).get();
        System.out.println("Сумма нечетных чисел = " + not_even );
    }
}
