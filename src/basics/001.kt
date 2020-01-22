package basics

fun main() {
    // Var para variables
    var cadena = "Hola"
    cadena = "Hola Mundo"
    println(cadena)

    // Val para valores
    val numero = 18
    // No va a funcionar
    //numero = 15
    println(numero)

    val clase = Clase(12)
    println(clase)
    // La referencia no puede cambiar, pero la clase sí
    clase.n = 15

    // No va a funcionar
    //clase = Clase(10)
    println(clase)

    // Tipo de datos específicos
    val texto: String = "Texto Aleatorio"
    var bandera: Boolean? = null
    bandera = true
}

// Los detalles de la implementación no son importantes ahorita
data class Clase(var n: Int)