package advanced

fun main() {
    repetir(1_000_000) {
        println("hola")
    }

    val complejo1 = Complejo(2.0, 2.0)
    val complejo2 = Complejo(2.0, 2.0)
    // Así se ven más bonitas las funciones
    println(complejo1 productoCruz complejo2)

    // Podemos llamar la función con todos los argumentos que queramos
    println(complejo1.multiplicarPorEscalares(5, 2, 5))
    val escalares = listOf(1, 1).toIntArray()
    // Convertimos una lista a una serie de argumentos con el operador *
    println(complejo2.multiplicarPorEscalares(2, *escalares))

    // Cuando es un objeto, utilizamos toTypedArray()
    val palabras = listOf("Hola", "me", "llamo", "André").toTypedArray()
    println(concatenar(*palabras))
}

// Inline: modificador que le notifica al compilador que copie el cuerpo de la función y lo ponga
// donde se invoca. Útil cuando hay que llamar muchas veces a una lambda
inline fun repetir(veces: Int, funcion: () -> Unit) {
    for (i: Int in 0..veces) {
        funcion()
    }
}

// Infix: función que recibe sólo un argumento sobre un "receiver"
// Puede devolver lo que sea
infix fun Complejo.productoCruz(otroComplejo: Complejo): Double {
    return (this.real * otroComplejo.real) + this.imaginario * otroComplejo.imaginario
}

// Con vararg decimos que vamos a recibir un número ilimitado de parámetros
fun Complejo.multiplicarPorEscalares(inicial: Int, vararg numeros: Int): Complejo {
    var multiplicador = inicial
    for (numero in numeros) {
        multiplicador *= numero
    }
    return Complejo(this.real * multiplicador, this.imaginario * multiplicador)
}

fun concatenar(vararg palabras: String): String{
    var fraseFinal = ""
    for (p in palabras) {
        fraseFinal += "$p "
    }

    return fraseFinal
}