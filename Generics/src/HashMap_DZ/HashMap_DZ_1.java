/**
 * 1. Создайте HashMap c ключами Integer, значениями – String.
 *  Напишите метод, который возвращает набор ключей, содержащихся в этой карте.
 *
 */
package HashMap_DZ;

import java.util.*;

public class HashMap_DZ_1 {
    public static void main(String[] args) {

        // HashMap c ключами Integer, значениями – String
        HashMap<Integer,String> regions = new HashMap<>();
        regions.put(63, "Самара");
        regions.put(77, "Москва");
        regions.put(78, "СПб");
        regions.put(64, "Саратов");

        System.out.println("Исходная коллекция: " + regions );
        System.out.println( keyPrint( regions ) );
    }
    // метод, который возвращает набор ключей, содержащихся в этой карте
    static Set<Integer> keyPrint (HashMap<Integer, String> reg){
        return reg.keySet();
    }
}
