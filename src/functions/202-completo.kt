package functions

fun main() {
    // Llamamos a una función con ciertos datos
    conectarABase("development")

    // Si no le envíamos ninguna cadena, se usa un valor predeterminado
    conectarABase()

    // Parámetros con nombre: útil cuando hay muchos parámetros
    conectarPorURL(
        protocolo = "http://",
        usuario = "andy",
        password = "ClaveChida123",
        host = "aws.com",
        nombre = "staging",
        pool = true
    )

    // Para mezclar argumentos normales y con nombre, se ponen los argumentos con nombre al final
    conectarPorURL("http://", "andy", "ClaveChida123", "aws.com", "staging", puerto = 1718, pool = true)

}

// Para asignar un valor predeterminado se pone así:
// nombre: Tipo = <VALOR PREDETERMINADO>
fun conectarABase(base: String = "pruebas") {
    println("Conectado a $base")
}

fun conectarPorURL(
    protocolo: String = "https://",
    usuario: String,
    password: String,
    host: String,
    nombre: String,
    puerto: Int = 1717,
    pool: Boolean = false
) {
    print("Conectado a $protocolo$usuario:$password@$host:$puerto/$nombre")
    println(if (pool) " con pool de conexiones" else "")
}