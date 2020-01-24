package basics

fun main() {
    var edad = 15
    val saludo: String
    // Podemos reemplazar el siguiente código tan común
    if(edad > 18) {
        saludo = "Buenos días"
    } else {
        saludo = "Hola :D"
    }

    // ...por este otro
    // En Kotlin, las sentencias pueden ser expresiones que regresan el valor de la última línea
    val saludo2: String = if(edad > 18) {
        "Buenos días"
    } else {
        "Hola :D"
    }

    // Así, se puede asignar un valor de esta forma mucho más directa
    val saludo3: String = if(edad > 18) "Buenos días" else "Hola :D"

    println(saludo3)

    // Otra expresión muy poderosa es when, funciona igual que un switch tradicional, pero es más poderoso
    val nombre = "Andy"
    when(nombre) {
        "André" -> println("Qué bonito nombre!")
        "Andy" -> println("Qué hermoso nombre!")
        else -> println("Qué nombre tan común...")
    }

    // Un ejemplo de lo poderoso que puede ser when
    val saludo4: String
    when {
        edad < 18 -> {
            saludo4 = "Hola :D"
        }
        edad >= 18 && edad <= 50 -> {
            saludo4 = "Buenos días"
        }
        else -> {
            saludo4 = "Qué pasó, mi buen?"
        }
    }

    // Igual que el if, el último valor será el que regrese
    val saludo5: String = when {
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

    println(saludo5)

    // Igual para try/catch, el último valor será el que se asigne
    val quizaEsUnNumero = try {
        "texto".toInt()
    }
    catch (e: NumberFormatException) {
        println("Error al convertir: ${e.message}")
        -1
    }

    println(quizaEsUnNumero)
}