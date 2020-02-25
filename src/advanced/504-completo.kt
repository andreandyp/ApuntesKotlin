package advanced

// Generics: cuando vamos a trabajar con tipos de datos complejos
infix fun <T> T.con(otro: Any) : Pair<T, Any> {
    return Pair(this, otro)
}

fun main() {
    val p1 = 5 to 6
    val p2 = 5 con 6

    println(p1 == p2)
}