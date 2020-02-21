package intermediate

import kotlin.random.Random

fun main (){
    val parNombre = Pair("nombre","Arheli")
    val parEdad = "edad" to 22

    val mapa = mapOf<String, Any>(parNombre,parEdad)

    println(mapa)
    println(crearEnteroDoubleRandom())

    val (first,segundo,tercero)=Triple("alimento","dulces","chocolate")
    println(first)
    println(segundo)
    println(tercero)

}

fun crearEnteroDoubleRandom() : Pair<Int,Double>{
    val numero = Random.nextInt(1,10)
    return Pair(numero,numero.toDouble())

}