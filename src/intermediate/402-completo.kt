package intermediate

data class Individuo(val nombre: String, val edad: Int, var casado: Boolean)

fun main() {
    // Con las data classes podemos usar destructuring para obtener datos facilmente
    // El nombre de las variables debe coincidir con el de las propiedades de la clase
    // Además deben estar en el mismo orden que en el constructor
    val (nombre, edad, casado) = Individuo("Andy", 22, false)

    // Si no necesitamos alguna propiedad, podemos omitirla con _
    val (_, edad2, casado2) = Individuo("Otro ser", 20, true)

    println(nombre)
    println(edad)
    println(casado)

    // También lo podemos hacer con clases normales, pero necesitamos hacer otras cosas...
}