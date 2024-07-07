package Lambda_DZ;

import java.util.ArrayList;
import java.util.List;

/**
 * Напишите программу, реализующую лямбда-выражение
 * для определения самого длинного слова в списке,
 * состоящего из нескольких слов.
 */
public class Long_Word {
    public static void main(String[] args) {
        // создаем список слов
        List<String> list = new ArrayList<>();
        list.add("лес");
        list.add("пёс");
        list.add("море");
        list.add("велосипед");
        list.add("осциллограф");
        list.add("электрокардиограмма");

        System.out.println("Исходный список: " + list );

        // создаем лямбду
        Word word = ( wordList ) -> {
            String longWord = "";
            int worSize = 0;
            for ( String str : wordList ){
                if ( str.length() > worSize ){
                    worSize = str.length();
                    longWord = str;
                }
            }
            return longWord;
        };
        // выводим результат лямбды
        System.out.println("Самое длинное слово: " + word.find(list));
    }
}
@FunctionalInterface
interface Word{
    String find ( List<String> list);
}
