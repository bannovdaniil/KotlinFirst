/*
Создайте класс Animal с полями name: String, x: Int, y: Int, который будет реализовывать интерфейс Movable
из предыдущей задачи (любой вариант реализации на ваш выбор)

Для этой задачи есть видео с разбором.
*/

class Animal(val name: String, var x: Int, var y: Int) : Movable {
    override fun moveLeft(stepX: Int) {
        println("Я $name, перемещаюсь в лево на $stepX");
        x += stepX;
    }

    override fun moveRight(stepX: Int) {
        println("Я $name, перемещаюсь в право на $stepX");
        x -= stepX;
    }

    override fun moveDown(stepY: Int) {
        println("Я $name, перемещаюсь вниз на $stepY");
        y += stepY;
    }

    override fun moveUp(stepY: Int) {
        println("Я $name, перемещаюсь в вверх на $stepY");
        y -= stepY;
    }
}