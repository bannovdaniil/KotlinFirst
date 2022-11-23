/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
    val animal = Animal("Лиса", 0, 0);
    val figure = TriangleM(1, 2, 3, "yellow");

    val movableObject = listOf<Movable>(animal, figure);

    for (movable in movableObject) {
        movable.moveDown(1);
        movable.moveLeft(3);
    }
}