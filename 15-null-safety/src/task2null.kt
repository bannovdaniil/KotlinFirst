/*
Есть классы:
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,
в которой располагается организация, в которой работает данный человек.
В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»
Используйте функции безопасного вызова и оператор элвис

Для этой задачи есть видео с разбором.
*/

fun main() {
    val address = Address("st. 1th", "New York");
    val company = CompanyVal("IBM", address);
    val employer = EmployeeVal("Oleg", company);

    val city = employeeCity(employer);
    println(city);
}

fun employeeCity(employee: EmployeeVal): String? {
    return employee.company?.address?.city;
}

class Address(val address: String, val city: String)
class CompanyVal(val name: String, val address: Address?)
class EmployeeVal(val name: String, val company: CompanyVal?)