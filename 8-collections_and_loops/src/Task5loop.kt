/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/

fun main() {
    val user1 = Employee("Kostya", 25);
    val user2 = Employee("Alena", 40);
    val user3 = Employee("Tigran", 45);

    val user4 = Employee("Sergey", 34);
    val user5 = Employee("Irina", 33);

    val listUser1 = listOf(user1, user2, user3);
    val listUser2 = listOf(user4, user5);

    val department1 = Department("Manager", listUser1);
    val department2 = Department("IT", listUser2);

    val company = Company("MetroMayerGroup", listOf(department1, department2));

    val count: Int = getCount(company);
    val averageAge = getAverageAge(company);
    println(
        "В компании \"${company.name}\" работает \"$count\" сотрудников," +
                " средний возраст \"${"%.2f".format(averageAge)}\"."
    );
}

fun getCount(company: Company): Int {
    var count: Int = 0;

    for (department in company.departments) {
        count += department.employees.size;
    }
    return count;
}

fun getAverageAge(company: Company): Double {
    var sumAge: Double = 0.0;
    var count: Int = 0;
    for (department in company.departments) {
        for (employee in department.employees) {
            sumAge += employee.age;
        }
        count += department.employees.size;
    }
    return sumAge / count;
}