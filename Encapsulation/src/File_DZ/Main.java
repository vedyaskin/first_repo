/**
 * Необходимо написать программу, которая дописывает файл.
 * Программа предлагает записать данные фразой "Вводите данные для записи".
 * После того, как введены данные в консоль (необходимо использовать класс Scanner для ввода данных в консоль),
 * программа предлагает дополнить информацию фразой «Введите что-нибудь еще» и данные можно дописать.
 * Вся работа по заполнению файла ведется в бесконечном цикле.
 * Если пользователь введет 0, программа завершается строкой «Файл создан»
 */
package File_DZ;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File( "/home/krk/IdeaProjects/Encapsulation/src/File_DZ/file.txt" );
        FileWriter writer = new FileWriter( file, true );

        String data = new String();
        Scanner console = new Scanner(System.in);
        System.out.println("Вводите данные для записи");

        while ( true ) {
            data = console.nextLine();
            // если строка имеет один символ и это символ "0", то цикл завершается
            if ( ( data.toCharArray().length == 1 ) && ( data.charAt(0) == '0' ) ) {
                break;
            }
            writer.write( "\n" + data );
            System.out.println("Введите что-нибудь еще");
        }
        writer.close();
        System.out.println("Файл создан");
    }
}
