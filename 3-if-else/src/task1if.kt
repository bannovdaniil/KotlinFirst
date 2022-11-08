/* Вывести на экран большее из двух целых чисел. */

fun main() {
    var a: Int = 1;
    var b: Int = 10;

    val max = if (a > b) {
        a;
    } else {
        b;
    }

    print(max);

}
