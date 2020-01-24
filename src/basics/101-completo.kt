package basics

fun main() {
    // Var para variables
    var cadena = "Hola"
    cadena = "Hola Mundo"
    println(cadena)

    // Val para valores
    val numero = 18
    // Los valores no se pueden reasignar. La siguiente línea es incorrecta:
    //numero = 15
    println(numero)

    // Ejemplo con valores no primitivos
    val clase = Clase(12)
    println(clase)
    // Las propiedades del objeto pueden cambiar...
    clase.n = 15

    // ...pero la variable que usamos para referenciar el objeto no se puede cambiar
    //clase = Clase(10)
    println(clase)

    // Se ponen : y el tipo de dato después de la variable o el valor
    // Aunque el compilador lo puede inferir en la mayoría de los casos
    var texto: String = "Texto Aleatorio"
    var bandera: Boolean = true
    bandera = false
}

// Los detalles de la implementación no son importantes en este momento
data class Clase(var n: Int)