/*
Для созданных в предыдущих задачах классов Rectangle и Round (нужно сюда скопировать ваш код этих классов)
пропишите суперкласс Figure, в котором будет поле цвет типа String, которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры в пространстве относитльено начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure

Для этой задачи есть видео с разбором.
*/

fun main() {
    val round = RoundR(10, "red");
    val rectangle = RectangleR(4, 5, "Yellow");

    println(round.color);
    println(rectangle.isSquare());
}

open class Figure(val color: String) {
    var x: Int = 0;
    var y: Int = 0;

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

class RectangleR(private val width: Int, private val height: Int, color: String) : Figure(color) {
    fun area(): Int {
        return width * height;
    }

    fun perimeter(): Int {
        return 2 * (width + height);
    }

    fun isSquare(): Boolean {
        return width == height;
    }

}

class RoundR(val radius: Int, color: String) : Figure(color) {
    fun area(): Double {
        return Math.PI * radius * radius;
    }

    fun length(): Double {
        return Math.PI * radius;
    }
}