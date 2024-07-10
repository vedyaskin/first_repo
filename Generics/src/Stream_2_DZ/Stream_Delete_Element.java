package Stream_2_DZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Напишите программу для удаления всех повторяющихся элементов из списка с помощью потоков
 */
public class Stream_Delete_Element {
    public static void main(String[] args) {
        List<Integer> count = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8, 9, 10));
        count.stream().distinct().forEach(System.out::println);
    }
}