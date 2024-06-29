
package Exception_DZ;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) throws Exception {
        int num;
        String exitString = "";
        boolean exit = false;
        /**
         * В этом цикле вызываем метод parity()
         */
        while ( !exit ){
            try {
                System.out.print("Введите число: ");
                num = new Scanner(System.in).nextInt();
                parity(num);
            } catch (Exception e) {
                System.out.println("Это не число.");
            }

            System.out.println("Для проверки второго задания нажмите q ");
            System.out.print("Для повтора цикла нажмите любую клавишу ");
            System.out.println();
            exitString =  new Scanner(System.in).nextLine();
            if ( exitString.equalsIgnoreCase("q") )
                exit = true;
        }
        exit = false;
        /**
         * В этом цикле вызываем метод checkString()
         */
        while ( !exit ){
            try {
                System.out.print("Введите строку для проверки на наличие чисел ");
                checkString(new Scanner(System.in).nextLine());
                System.out.println("В строке нет чисел");
            } catch ( Exception e ) {
                System.out.println("В строке есть числа.");
            }
            System.out.println("Для выхода нажмите q ");
            System.out.print("Для повтора цикла нажмите любую клавишу ");
            System.out.println();
            exitString =  new Scanner(System.in).nextLine();
            if ( exitString.equalsIgnoreCase("q") )
                exit = true;
        }
    }
    /**
     * метод, который принимает целое число в качестве параметра и
     * выдает исключение, если число нечетное.
     */
    public static void parity( int num ) throws Exception {
            try {
                if ( (num % 2) != 0 ) throw new Exception();
                else System.out.println("Число четное.");

            } catch (Exception e) {
                System.out.println("Число не четное.");
            }

    }
    /**
     * метод, который принимает строку в качестве входных данных
     * и выдает исключение, если строка содержит числа
     */

    public static void checkString( String string ) throws Exception{
        char[] stringArray = string.toCharArray();
        for (char i : stringArray){
            if ( Character.isDigit(i) ) throw new Exception();
        }
    }
}
