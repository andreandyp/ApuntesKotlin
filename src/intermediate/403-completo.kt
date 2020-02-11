package intermediate

import kotlin.random.Random

fun main() {
    // Una data class muy útil: Pair
    val parNombre = Pair("nombre", "Andy")

    // Podemos crearla con to
    val parEdad = "edad" to 17

    // Los pares son asociativos a la izquierda, eso quiere dedir que este par se hará
    // de esta manera si quitas los paréntesis:
    val parAsociativo = ("alimento" to "frutas") to "manzana"

    // Muy útil para crear mapas con información previa
    val mapa = mapOf(parNombre, parEdad)

    println(mapa)

    // O para regresar más de un valor de una función
    println(devolverEnteroYDouble())

    // Con tod0 y destructuring
    val (first, second) = devolverEnteroYDouble()
    println(first)
    println(second)

    // También existen los triples
    val triple = Triple("v1", "v2", "v3")
    println(triple)
}

fun devolverEnteroYDouble(): Pair<Int, Double> {
    val numero = Random.nextInt(1, 10)
    return numero to numero * 1.0
}