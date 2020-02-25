package advanced

import kotlin.math.sqrt

fun Complejo.modulo(): String {
    return sqrt(Math.pow(this.real, 2.0) + Math.pow(this.imaginario, 2.0)).run {
        // Aquí existen 2 "this": el "this" que se refiere al número complejo
        // Y el this que se refiere a run()
        // Con el @ definimos el this al que queremos acceder.
        // El "this" solito es el más interno, mientras que los this con @ son más externos
        "|z| = |${this@modulo}| = $this"
    }
}

fun main() {
    val complejo = Complejo(2.0, 2.0)
    println(complejo.modulo())

    val matriz = listOf(listOf(1, 0), listOf(0, 1))

    matriz.forEach { filas: List<Int> ->
        filas.forEachIndexed { index, elem ->
            // Aquí hay 3 returns:
            // El de la función, el del forEach y el de forEachIndexed
            // Con el @ especificamos cuál return es
            if(elem == 1){
                return@main
            }
        }
    }
}