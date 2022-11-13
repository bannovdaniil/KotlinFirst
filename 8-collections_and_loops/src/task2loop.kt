/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val user1 = Employee("Kostya", 25);
    val user2 = Employee("Alena", 41);
    val user3 = Employee("Tigran", 45);

    val listUser = listOf(user1, user2, user3);

    val youngUser: Employee = getYoungUser(listUser);

    println(youngUser);
}

fun getYoungUser(listUser: List<Employee>): Employee {
    var young: Employee = listUser[0];
    for (employee in listUser) {
        if (employee.age < young.age) {
            young = employee;
        }
    }
    return young;
}
