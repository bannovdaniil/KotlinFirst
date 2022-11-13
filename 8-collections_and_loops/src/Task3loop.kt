/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и доступны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val car1 = Car("BMW", "x1", 5.5);
    val car2 = Car("Audi", "tt", 12.3);
    val car3 = Car("Chevrolet", "Niva", 2.4);

    val user = User("Sema", 25, 6);
    val listCar = listOf(car1, car2, car3);

    println(getCar(listCar, user));
}

fun getCar(listCar: List<Car>, user: User): List<Car> {
    val availableListCar = mutableListOf<Car>();

    for (car in listCar) {
        if (user.age >= 24 && user.experience >= 6) {
            availableListCar.add(car);
        } else {
            if (car.brand != "BMW" && car.brand != "Audi") {
                availableListCar.add(car);
            }
        }
    }
    return availableListCar;
}

