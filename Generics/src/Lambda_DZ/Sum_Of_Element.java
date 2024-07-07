package Lambda_DZ;

import java.util.ArrayList;
import java.util.List;

/**
 * Напишите программу, реализующую лямбда-выражение для вычисления суммы всех четных элементов списка.
 */
public class Sum_Of_Element {

    public static void main(String[] args) {

        // создаем список
        List<Integer> array = new ArrayList<>();

        // заполняем список
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }
        System.out.println("Исходный список: " + array);

        // создаем экземпляр интерфейса Sum и в качестве аргумента
        // передаем ссылку на метод addition
        Sum sum = Sum_Of_Element::addition;

        // выводим результат работы лямбды
        System.out.println("Сумма четных элементов = " + sum.calculate(array));
    }

    // метод для вычисления суммы всех четных элементов списка
    static int addition(List<Integer> array) {
        int result = 0;
        for (Integer element : array) {
            if (element % 2 == 0) result += element;
        }
        return result;
    }
}

interface Sum {
    int calculate(List<Integer> array);
}
