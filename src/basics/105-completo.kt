package basics

fun main() {
    // En Kotlin, todos los tipos de datos son no nulos
    // A menos que lo especifiquemos con el símbolo ?
    var nombre: String? = "Andy"
    // Entonces podemos asignar nulo
    nombre = null

    // El símbolo ? se pone en el tipo que va a ser nulo, ve las diferencias
    val listaNula: List<Int>? // Lista de enteros que puede ser nula

    val listaConNulos: List<Int?> // Lista que puede contener enteros y/o nulos

    val listaInsegura: List<Int?>? //Lista que puede ser nula y que contiene enteros y/o nulos

    // Operador ?: (Elvis), si el lado izquierdo es nulo, evalúa el lado derecho
    println(nombre ?: "Juan")

    var nombre2: String? = null
    // Operador Null assertion, si estamos seguros de que el valor no es nulo, le indicamos a Kotlin
    // que confíe en nosotros utilizando este operador después del valor
    // No recomendado porque da lugar a NullPointerExceptions si nos equivocamos
    //println(nombre2!!)

    var perro: Perro? = Perro("Bobby")

    // Operador null coalescing: si el objeto existe, accede a la propiedad indicada
    // Podemos utilizar el operador Elvis para imprimir un valor alternativo cuando es nulo
    // Descomenta la línea de abajo para ver al Elvis en acción
    //perro = null
    println(perro?.nombre ?: "No hay perro")
}

// Los detalles de la implementación no son importantes en este momento
data class Perro(var nombre: String)
