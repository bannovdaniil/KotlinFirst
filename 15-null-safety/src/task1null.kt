import kotlin.math.E

/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {
    val em1 = SomeEmployer("Igor", 10_000);
    val em2 = SomeEmployer("Anna", 20_000);

    val employer1 = findEmployeeBySalary(listOf<SomeEmployer>(em1, em2), 10_000);
    println(employer1);

    val employer2 = findEmployeeBySalary(listOf<SomeEmployer>(em1, em2), 5_000);
    println(employer2);

}

fun findEmployeeBySalary(employees: List<SomeEmployer>, salary: Int): SomeEmployer? {
    for (employee in employees) {
        if (employee.salary == salary) {
            return employee;
        }
    }
    return null;
}

data class SomeEmployer(val name: String, val salary: Int) {
    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}