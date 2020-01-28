package functions

fun main() {
    conectarABase2()
    conectarPorURL2(protocolo = "http://",usuario = "Itz",password = "Gato",host = "Any",nombre = "test",puerto = 1292,pool = true)
}

fun conectarABase2(nombreBD:String = "test"){
    println("Conectado a BD $nombreBD")
}

fun conectarPorURL2(
    protocolo: String = "https://",
    usuario : String,
    password :String,
    host : String,
    nombre : String,
    puerto :Int = 1717,
    pool : Boolean = false){
    print("Conectado a $protocolo$usuario:$password@$host:$puerto/$nombre ")
    println(if(pool)"con pull activado" else "")
}