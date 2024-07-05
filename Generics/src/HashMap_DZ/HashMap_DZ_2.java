/**
* Создайте HashMap c ключами Integer,
 *  значениями – String. Напишите метод, который возвращает ассоциативный массив,
 *  состоящий из элементов исходного map, при условии, что туда войдут элементы
 *  с длиной строки более 3.
 * Т.е. исходный map: [1="Red",2="Green",3="Black"].
 * Новый map: [2="Green",3="Black"].
 *
 */
package HashMap_DZ;

import java.util.HashMap;
import java.util.Map;

public class HashMap_DZ_2 {
    public static void main(String[] args) {
        // Исходный HashMap
        HashMap<Integer,String> regions = new HashMap<>();
        regions.put(63, "Самара");
        regions.put(77, "Мск");
        regions.put(78, "СПб");
        regions.put(64, "Саратов");

        System.out.println("Исходный Map: " + regions );
        System.out.println("Отфильтрованный Map: " + filterReg( regions ));
    }
    // метод фильтрации

    static Map<Integer, String> filterReg ( HashMap<Integer, String> reg ){

        HashMap<Integer, String> filteredRegions = new HashMap<>();

        for ( Map.Entry<Integer, String> entry : reg.entrySet() ){
            if ( entry.getValue().length() > 3 ) {
                filteredRegions.put( entry.getKey(), entry.getValue());
            }
        }
        return filteredRegions;
    }
}
