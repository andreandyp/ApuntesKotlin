package advanced

import kotlin.math.absoluteValue
import kotlin.math.sign

data class Complejo(
    val real: Double = 0.0,
    val imaginario: Double = 0.0
) {
    // Sobrecarga de operadores en Kotlin.
    // Para hacerlo, utilizamos el modificador "operator" y el nombre de la función que equivale
    // al operador que vamos a sobrecargar
    operator fun plus(otroComplejo: Complejo): Complejo {
        return Complejo(
            real + otroComplejo.real,
            imaginario + otroComplejo.imaginario
        )
    }
    operator fun minus(otroComplejo: Complejo): Complejo {
        return Complejo(
            real - otroComplejo.real,
            imaginario - otroComplejo.imaginario
        )
    }

    override fun toString(): String {
        return "$real ${if(imaginario.sign == -1.0) '-' else '+'} ${imaginario.absoluteValue}i"
    }
}
