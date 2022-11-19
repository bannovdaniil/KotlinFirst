/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

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

    println(elementsCount(userList) { it.age > 30; });
    println(elementsCount(userList) { it.age > 35; });
    println(elementsCount(userList) { it.age < 20; });
    println(elementsCount(userList) { it.age > 19; });
    println(elementsCount(userList) { it.age == 25; });

}

fun elementsCount(users: List<UserR>, condition: (UserR) -> Boolean): Int {
    var count = 0;
    for (user in users) {
        if (condition(user)) {
            count++;
        }
    }
    return count;
}