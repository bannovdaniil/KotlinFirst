fun main() {
    val email: String = "test@mail.com";
    if(email.contains("@") && email.contains(".")){
        println("email: $email - ok");
    }

    val numberA: Int = 10;
    val numberB: Int = 5;
    val answer: String = if (numberA > numberB) {
        "A больше B";
    } else {
        "B больше A";
    }
    println(answer);

    if (numberA > 20) {
        println("A > 20");
    } else if (numberA > 10) {
        println("A > 10");
    } else {
        println("<=10");
    }

    val select = when (numberB) {
        1 -> "ok";
        2 -> "bad";
        else -> "so-so";
    }
    println(select);
}
