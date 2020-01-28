package functions

fun main() {
    // Lambdas: también conocidas como funciones anónimas
    connectToDatabase("test") { nombreDB: String, puerto: Int ->
        println("Conectado a $nombreDB, en el puerto $puerto")
    }

    // Si no ocupamos algún parámetro, lo podemos reemplazar con "_"
    connectToDatabase("dev") { nombreDB, _ ->
        println("Conectado a $nombreDB")
    }

    // Podemos enviar lambdas
    val callback = { nombreDB: String, _: Int ->
        println("Conexión en $nombreDB")
        if(nombreDB == "production"){
            println("¡ESTAMOS EN PRODUCTION")
            println("ALEJEN AL BECARIO")
            println("En viernes no se despliega")
        }
    }
    connectToDatabase("production", callback)

    // Hay otros casos: lambdas que devuelven valores y lambdas con un sólo parámetro
    // Para más detalles, ve a la lección de forEach, map, filter
}

// Una lambda se recibe así:
// nombreLambda: (param1: Tipo, param2: Tipo, ...) -> TipoRetorno
fun connectToDatabase(nombre: String = "test", onConnected: (nombreDB: String, puerto: Int) -> Unit) {
    val puerto = 1717
    if(nombre.isNotEmpty()) {
        onConnected(nombre, puerto)
    }
}
