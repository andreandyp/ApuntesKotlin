package functions

fun main() {
    val numeros = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // forEach: por cada elemento, ejecuta la lambda
    // Devuelve Unit
    // Cuando la lambda sólo tiene un argumento y no se especifica en la lambda con la flecha
    // it se convierte en el nombre de ese argumento
    numeros.forEach {
        print("$it ")
    }
    println()

    // Modifica cada elemento según lo que diga la lambda
    // Devuelve una nueva lista
    // La lambda regresa el elemento modificado
    val cuadrados = numeros.map { numero: Int ->
        numero * numero
    }
    println(cuadrados)

    // Filtra los elementos con base en una condición booleana
    // Devuelve una nueva lista
    // Si la lambda regresa true, se añade el elemento a una nueva lista, si no, no se añade
    val pares = numeros.filter {
        it % 2 == 0
    }
    println(pares)
}