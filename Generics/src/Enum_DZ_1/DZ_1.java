package Enum_DZ_1;

import java.util.ArrayList;

/**
 * 1. Необходимо написать метод, который возвращает позицию буквы алфавита.
 * Для реализации программы создать enum алфавита.
 */

public class DZ_1 {
    public static void main(String[] args) {
        // создаем массивы
        ArrayList<Alphabet> eng = new ArrayList<>();
        ArrayList<Alphabet> rus = new ArrayList<>();

        // заполняем английский алфавит
        for (int i = 97; i <= 122; i++) {
            eng.add(new Alphabet((char) i, Alphabet.AlphabetType.ENG));
        }

        // заполняем русский алфавит
        for (int i = 1072; i <= 1103; i++) {
            rus.add(new Alphabet((char) i, Alphabet.AlphabetType.RUS));
        }

        System.out.println( rus );
        System.out.println("Позиция элемента: " + getPosition( eng, 'b') );
        System.out.println("Позиция элемента: " + getPosition( rus, 'f') );
    }
    // метод, который возвращает позицию буквы алфавита
    static int getPosition ( ArrayList<Alphabet> list, char letter ){
        int position = 0;
        for ( int i = 0; i < list.size(); i++){
           if ( list.get(i).letter == letter){
               position = i + 1;
           }
        }
        if (position <= 0) System.out.println("Такой буквы нет.");
        return position;
    }

    // Класс описывающий алфавит
    static class Alphabet {

        AlphabetType alphabetType;
        char letter;

        public Alphabet(char letter, AlphabetType alphabetType) {
            this.letter = letter;
            this.alphabetType = alphabetType;
        }
        @Override
        public String toString() {
            return " Alphabet{" +
                    ", letter= " + letter +
                    " alphabetType= " + alphabetType.getAlphabetType() +
                    '}';
        }

        // создаем enum
        enum AlphabetType {
            ENG("eng"),
            RUS("rus");
            String alphabetType;
            AlphabetType(String alphabetType) {
                this.alphabetType = alphabetType;
            }
            public String getAlphabetType() {
                return alphabetType;
            }
        }
    }
}
