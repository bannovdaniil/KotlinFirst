/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun main() {
    val a: Int = 10;
    val b: Int = 5;

    print("Max: " + getMaxNumber(a, b));
}

fun getMaxNumber(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}
