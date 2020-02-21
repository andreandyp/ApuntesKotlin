package intermediate

import kotlin.random.Random
import kotlin.system.exitProcess

fun main(){
    //Ctrl + q nos dice la documentacion dle metodo o de lo que sea
    val parNombre = Pair("nombre","Itz")
    val parEdad = "edad" to 23

    val alimentoFav = ("alimento" to "dulces") to "chocolate"

    val mapa = mapOf<String,Any>(parNombre,parEdad)

    println(mapa)
    println(crearEnteroDoubleRandom())

    val (entero,decimal) = crearEnteroDoubleRandom()
    val (primero,segundo,tercero) = Triple("alimento","dulces","chocolate")
    println("primero")
    println("segundo")
    println("tercero")


}

fun crearEnteroDoubleRandom(): Pair<Int, Double>{
    val numero = Random.nextInt(1,10)
    return Pair(numero,numero.toDouble())
}