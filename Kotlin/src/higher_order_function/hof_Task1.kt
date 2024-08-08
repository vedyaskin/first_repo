package higher_order_function

/**
 * 1. Написать функцию высшего порядка action,
 * которая на вход принимает значения двух цветов типа String.
 * Они будут смешиваться в функции, которая на вход поступает в качестве третьего аргумента в action,
 * она же возвращает строку – получившейся цвет.
 * Функция action возвращает результат в виде строки смешанный цвет из двух заданных.
 */
fun main(){
    println(action("Red", "Blue", ::blender))
}

fun blender(color_1: String, color_2: String) = "Получившейся цвет: ${color_1 + color_2}"

fun action(color_1: String, color_2: String, op: (String, String) -> String): String {
    return op(color_1, color_2)
}