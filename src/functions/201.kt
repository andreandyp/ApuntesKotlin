package functions

fun main() {
    crearSaludo2("Itzel")
    val respuesta = saludar2("Itzel")
    println(respuesta)
    val res  = multiplicar2()
    println(res)
}

fun crearSaludo2(nombre: String){
    println("Hola $nombre")
}

fun saludar2(nombre:String):String{
    return "Hola $nombre"
}

//one-liners
fun multiplicar2(numero1: Int, numero2: Int):Int = numero1 * numero2
//Podemos agregar el signo de interrogación para que regrese un null
//En kotlin también existe sobrecarga de métodos
fun multiplicar2() : Int{
    return 2+2
}