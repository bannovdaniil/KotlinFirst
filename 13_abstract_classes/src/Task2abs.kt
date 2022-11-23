import kotlin.math.sqrt

/*
Добавить еще один класс Triangle – тоже наследник Figure (который вы сделали в предыдущем задании)
и прописать работу функций area() и length() для него

Для этой задачи есть видео с разбором.
*/

fun main() {
    val tr1 = TriangleZ(3, 4, 5, "red");

    println(tr1.perimeter());
    println(tr1.area());
}

class TriangleZ(
    private val sideA: Int,
    private val sideB: Int,
    private val sideC: Int,
    color: String
) : FigureZ(color) {
    override fun area(): Double {
        val per = perimeter() / 2.0;
        return sqrt(per * (per - sideA) * (per - sideB) * (per - sideC));
    }

    override fun perimeter(): Double {
        return (sideA + sideB + sideC).toDouble();
    }

}