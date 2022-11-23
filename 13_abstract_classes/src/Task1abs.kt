/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
*/

fun main() {
    val round = RoundZ(10, "red");
    val rectangle = RectangleZ(4, 5, "Yellow");

    println(round.color);
    println(rectangle.isSquare());
}

abstract class FigureZ(val color: String) {
    var x: Int = 0;
    var y: Int = 0;

    abstract fun area(): Double;

    abstract fun perimeter(): Double;

    fun moveLeft(stepX: Int) {
        x -= stepX;
    }

    fun moveRight(stepX: Int) {
        x += stepX;
    }

    fun moveDown(stepY: Int) {
        y += stepY;
    }

    fun moveUp(stepY: Int) {
        y -= stepY;
    }
}

class RectangleZ(private val width: Int, private val height: Int, color: String) : FigureZ(color) {
    override fun area(): Double {
        return width * height * 1.0;
    }

    override fun perimeter(): Double {
        return 2.0 * (width + height);
    }

    fun isSquare(): Boolean {
        return width == height;
    }

}

class RoundZ(val radius: Int, color: String) : FigureZ(color) {
    override fun area(): Double {
        return Math.PI * radius * radius;
    }

    override fun perimeter(): Double {
        return Math.PI * radius;
    }
}