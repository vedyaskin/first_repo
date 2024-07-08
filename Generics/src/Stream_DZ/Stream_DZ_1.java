package Stream_DZ;
import java.util.Arrays;
import java.util.List;

/**
 * Создайте список типа String, например, названия пищевых продуктов.
 * Напишите программу для подсчета количества строк в списке,
 * начинающихся с определенной буквы, с использованием потоков.
 */
public class Stream_DZ_1 {
    public static void main(String[] args) {
    //Создайте список типа String
        List<String> foodList = Arrays.asList(
                "хлеб", "Молко", "мясо", "Картофель", "Арбуз",
                "малина", "манго", "киви"
        );
        // указываем начальную букву
        char initialChar = 'м';

        // создаем переменную count и присваиваем ей результат работы метода count()
        long count = foodList.stream()
           // на всякий случай перводим слово в нижний регистр
                .map(e -> e.toLowerCase())
          // переводим букву в нижний регистр и фильтруем по начальной букве
                .filter( e -> e.charAt(0) == Character.toLowerCase( initialChar ) )
                .count();
        System.out.println("Количество продуктов: " + count );
    }
}
