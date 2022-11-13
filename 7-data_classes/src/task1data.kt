/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Необязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

data class CarUser(val name: String, val age: Int, val experience: Int);
data class ShareCar(val brand: String, val model: String);

fun main() {
    val user = CarUser("Adam", 25, 14);
    val car1 = ShareCar("BMW", "x1");
    val car2 = ShareCar("Audi", "x1");

    println(user);
    println(getCarshare(user));

    if (isMayUserGetcar(user, car1)) {
        println("Можно ездить на: $car1");
    } else {
        println("Вам не доверят: $car1");
    }

    if (isMayUserGetcar(user, car2)) {
        println("Можно ездить на: ${car2.brand}");
    } else {
        println("Вам не доверят: ${car2.brand}");
    }
}

private fun getCarshare(user: CarUser): String {
    val result = if (user.age >= 26 && user.experience >= 6) {
        "можно воспользоваться авто: BMW и Audi";
    } else if (user.age >= 21 && user.experience >= 2) {
        "можно пользоваться каршерингом.";
    } else {
        "не достаточно опыта для пользования каршерингом.";
    }
    return result
}

private fun isMayUserGetcar(user: CarUser, car: ShareCar): Boolean {
    return (car.brand == "BMW" || car.brand == "Audi") && user.age >= 26 && user.experience >= 6;
}