/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val user1 = Employee("Kostya", 25);
    val user2 = Employee("Alena", 40);
    val user3 = Employee("Tigran", 45);

    val listUser = listOf(user1, user2, user3);

    val department = Department("Manager", listUser);

    val averageAge = getAverageAge(department);

    println("Средний возраст подразделения ${department.name} равен ${"%.2f".format(averageAge)}");
}

fun getAverageAge(department: Department): Double {
    var sumAge: Double = 0.0;
    for (employee in department.employees) {
        sumAge += employee.age;
    }
    return sumAge / department.employees.size;
}
