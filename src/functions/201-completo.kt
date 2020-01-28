package functions

fun main() {
    saludar("Andy")
    println(crearSaludo("André"))
    println(multiplicar(2, 10))
}

// Declaración de funciones
//fun nombre(param1: Tipo, param2: Tipo, ...){}
fun saludar(nombre: String) {
    println("Hola $nombre")
}

// Si la función regresa algo, se ponen : después de los paréntesis y el tipo de dato que regresa
fun crearSaludo(nombre: String): String {
    return "Hola $nombre"
}

// Cuándo la función ocupa sólo una línea, se puede refractorizar de esta manera
fun multiplicar(numero1: Int, numero2: Int): Int = numero1 * numero2