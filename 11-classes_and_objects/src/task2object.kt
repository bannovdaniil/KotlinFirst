/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

fun main() {
    val round = Round(21);

    println("Площадь: ${"%.2f".format(round.area())}");
    println("Длина окружности: ${"%.2f".format(round.area())}");
}

class Round(private val radius: Int) {
    fun area(): Double {
        return Math.PI * radius * radius;
    }

    fun length(): Double {
        return Math.PI * radius;
    }
}