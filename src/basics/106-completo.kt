package basics

fun main() {
    val numero = 12
    // En Kotlin, muchos de los valores primitivos se pueden convertir entre sí con algún método "to"
    // sin necesidad de parsear
    println(numero.toDouble())

    val numero2 = 14
    println(numero2 + 14)

    // En Kotlin, los cast se hacen mediante la palabra reservada "as"
    // Convertimos un String en un Any
    val nombre = "Andy" as Any

    // En Kotlin se acostumbra a tener métodos "as", que convierten de un tipo de datos a otro
    val arreglo: Array<Int> = arrayOf(1, 2, 3)
    println(arreglo.asList())

    // ¿Qué pasa si queremos saber el tipo de una variable/valor?
    // Utilizamos la palabra reservada "is"
    var variable: Any = 17
    // Prueba a cambiar el tipo de dato
    when(variable) {
        is Int -> println("Es un entero")
        is Double -> println("Es un double")
        is String -> println("Es una cadena")
    }
}
