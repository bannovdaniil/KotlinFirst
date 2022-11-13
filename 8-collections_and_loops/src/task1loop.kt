/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает средний возраст всех
пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val listEmployee = listOf(
        Employee("Oleg", 31),
        Employee("Fedor", 35),
        Employee("Irina", 29)
    );

    val averageAges = getAverageAge(listEmployee);
    println("Средний возраст команды: ${"%.2f".format(averageAges)}");
}

fun getAverageAge(listEmployee: List<Employee>): Double {
    var sumAge: Double = 0.0;
    for (employee in listEmployee) {
        sumAge += employee.age;
    }
    return sumAge / listEmployee.size;
}
