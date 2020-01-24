package basics

fun main() {
    val nombre = "Andy"
    // En vez de concatenar cadenas y variables/valores, podemos interpolarlos con el signo de $
    println("Hola $nombre")

    val persona = Persona("Andy 2")
    // Cuando queremos interpolar expresiones, debemos utilizar ${} y poner la expresión entre las llaves
    println("Hola ${persona.nombre}")
}

// Los detalles de la implementación no son importantes en este momento
data class Persona(var nombre: String)