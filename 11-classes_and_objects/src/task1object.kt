/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height)).
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

fun main() {
    val rectangle = Rectangle(4, 5);

    println("Площадь: ${rectangle.area()}");
    println("Периметр: ${rectangle.perimeter()}");
    println("Это квадрат: ${rectangle.isSquare()}");
}

class Rectangle(private val width: Int, private val height: Int) {

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