package basics

fun main() {
    val nombre = "Andy"
    val persona = Persona("Andy 2")
    println("Hola ${persona.nombre}")
}

data class Persona(var nombre: String)