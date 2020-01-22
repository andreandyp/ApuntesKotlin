package basics

fun main() {
    var edad = 60
    var saludo: String = if(edad > 18) "Buenos días" else "Hola :D"

    println(saludo)

    var saludo2 = when {
        edad < 18 -> {
            "Hola :D"
        }
        edad >= 18 && edad <= 50 -> {
            "Buenos días"
        }
        else -> {
            "Qué pasó, mi buen?"
        }
    }

    println(saludo2)
}