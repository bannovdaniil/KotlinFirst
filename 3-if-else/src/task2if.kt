/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */

fun main() {
    var a: Int = 5;
    var b: Int = 5;

    val result: String = when {
        (a > b) -> "первое число больше";
        (b > a) -> "второе число больше";
        else -> "числа равны";
    }
    print(result);
}