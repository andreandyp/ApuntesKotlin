package classes

// Para añadir funcionalidad extra a alguna clase sin modificar el código fuente original,
// podemos usar extension functions. Sólo podemos acceder a las propiedades públicas
// Y se declaran así:
// fun Clase.nombreExtFunction(param1: Tipo, param2: Tipo, ...): TipoRetorno
fun MetrobusBajo.mostrarEstacionActual() {
    val estacionActual = this.estaciones.find {
        it.actual
    }

    println("Estación actual: ${estacionActual!!.nombre}")
}

// El ejemplo clásico, pero simpre útil
// Extensión a la clase String
fun String.toSarcasm(): String =
    this.toCharArray().mapIndexed { index, c -> if (index % 2 == 0) c.toLowerCase() else c.toUpperCase() }
        .joinToString("")