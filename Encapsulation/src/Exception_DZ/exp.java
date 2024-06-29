package Exception_DZ;
import java.util.Scanner;
public class exp {
    public static void main(String[] args){

        String exitString = "";
        boolean exit = ( exitString.equals("y") );


        while ( !exit ){
            try {
                System.out.print("Введите число: ");
                int i = new Scanner(System.in).nextInt();
            } catch ( Exception e) {
                System.out.println("Это не число.");

            }
            System.out.print("Для выхода нажмите q ");
            exitString =  new Scanner(System.in).nextLine();

            if ( exitString.equalsIgnoreCase("q") ) exit = true;


        }


    }
}
