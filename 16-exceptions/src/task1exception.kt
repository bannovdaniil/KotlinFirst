/*
Переделайте функцию findEmployeeBySalary из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee, а не SomeEmployee?
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. Здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {
    val em1 = SomeEmployer("Igor", 10_000);
    val em2 = SomeEmployer("Anna", 20_000);

    val employer1 = findEmployeeBySalarySafe(listOf<SomeEmployer>(em1, em2), 10_000);
    println(employer1);
    try {
        val employer2 = findEmployeeBySalarySafe(listOf<SomeEmployer>(em1, em2), 5_000);
        println(employer2);
    } catch (e: Exception) {
        println(e.message)
    }
}

class SomeEmployee(
    val name: String,
    val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalarySafe(employees: List<SomeEmployer>, salary: Int): SomeEmployer {
    for (employee in employees) {
        if (employee.salary == salary) {
            return employee;
        }
    }
    throw Exception("Человек с такой зарплатой не найден.");
}