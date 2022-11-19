/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean

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

    println(containsElement(userList) { it.age > 30; });
    println(containsElement(userList) { it.age > 35; });
    println(containsElement(userList) { it.age < 20; });
    println(containsElement(userList) { it.age < 19; });
    println(containsElement(userList) { it.age == 25; });
}

fun containsElement(users: List<UserR>, condition: (UserR) -> Boolean): Boolean {
    for (user in users) {
        if (condition(user)) {
            return true;
        }
    }
    return false;
}