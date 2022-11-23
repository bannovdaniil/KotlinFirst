import kotlin.math.sqrt

/*
Создайте интерфейс Movable (перемещаемый), в котором будут описаны функции moveLeft(step: Int), moveRight(step: Int),
moveDown(step: Int), moveUp(step: Int).

Сделайте так, чтобы класс Figure из предыдущего задания реализовывал интерфейс Movable (скопируйте сюда код написанного
вами класса Figure)

Для этой задачи есть видео с разбором.
*/

interface Movable {
    fun moveLeft(stepX: Int);
    fun moveRight(stepX: Int);
    fun moveDown(stepY: Int);
    fun moveUp(stepY: Int);
}

abstract class FigureM(val color: String) : Movable {
    var x: Int = 0;
    var y: Int = 0;

    abstract fun area(): Double;

    abstract fun perimeter(): Double;

    override fun moveLeft(stepX: Int) {
        x -= stepX;
    }

    override fun moveRight(stepX: Int) {
        x += stepX;
    }

    override fun moveDown(stepY: Int) {
        y += stepY;
    }

    override fun moveUp(stepY: Int) {
        y -= stepY;
    }
}

class TriangleM(
    private val sideA: Int,
    private val sideB: Int,
    private val sideC: Int,
    color: String
) : FigureM(color) {
    override fun area(): Double {
        val per = perimeter() / 2.0;
        return sqrt(per * (per - sideA) * (per - sideB) * (per - sideC));
    }

    override fun perimeter(): Double {
        return (sideA + sideB + sideC).toDouble();
    }

}