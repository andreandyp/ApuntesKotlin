package basics

fun main() {
    var nombre: String? = "Andy"
    nombre = null

    println(nombre ?: "Juan")

    var nombre2: String? = null


    // Null assertion
    //println(nombre2!!)
    var perro: Perro? = Perro("Bobby")
    perro = null

    // Null coalescing operator
    println(perro?.nombre ?: "No hay perro")
}

data class Perro(var nombre: String? = null)