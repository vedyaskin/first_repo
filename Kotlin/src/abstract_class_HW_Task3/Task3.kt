package abstract_class_HW_Task3

/**
 * 3. Единицы длины пронумерованы следующим образом:
 * 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр.
 * Дан номер единицы длины (целое число в диапазоне 1–5) и
 * длина отрезка в метрах (дробное число).
 * Найти длину отрезка в тех величинах, под номером которых они находятся.
 */
fun main(){
    var unitOfLength = 5
    var lengthInMeters = 1.5

    var dmInMeter =  lengthInMeters * 10
    var kmInMeter =  lengthInMeters / 1000
    var mmInMeter = lengthInMeters * 1000
    var cmInMeter = lengthInMeters * 100

    when (unitOfLength){
        1 -> println("Отрезок равен $dmInMeter дм.")
        2 -> println("Отрезок равен $kmInMeter км.")
        3 -> println("Отрезок равен $lengthInMeters м.")
        4 -> println("Отрезок равен $mmInMeter мм.")
        5 -> println("Отрезок равен $cmInMeter см.")
    }
}