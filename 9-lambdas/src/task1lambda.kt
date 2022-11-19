/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    val user1 = UserR("Renat", 21);
    val user2 = UserR("Roman", 25);
    val user3 = UserR("Rita", 31);
    val user4 = UserR("Evgeniy", 19);

    val userList = listOf(user1, user2, user3, user4);

    val resultList = convertToString(userList) { "Имя: ${it.name}, возраст: ${it.age}" };

    println(resultList);
}

fun convertToString(users: List<UserR>, conversion: (UserR) -> String): List<String> {
    val resultList = mutableListOf<String>();
    for (user in users) {
        resultList.add(conversion(user));
    }
    return resultList;
}
