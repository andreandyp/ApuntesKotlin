package basics

fun main() {
    // En Kotlin tenemos rangos de valores (inclusivos)
    // Podemos usarlos en for
    for (i: Int in 0..9){
        print(i)
    }
    println()

    // Podemos usarlos con caracteres
    for(letra: Char in 'a'..'e') {
        print(letra)
    }
    println()

    // Si queremos que los rangos sean exclusivos al final, utilizamos until
    for (i: Int in 0 until 10){
        print(i)
    }
    println()

    // ¿En reversa? Sí, con downTo (inclusive)
    for (i: Int in 9 downTo 0) {
        print(i)
    }
    println()

    // Podemos ir avanzado en varios pasos con step (únicamente pasos constantes)
    for (i: Int in 0..16 step 2) {
        print("$i ")
    }
    println()
}