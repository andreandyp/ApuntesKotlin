package functions

fun main() {
    val lista = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    //It es el argumento predeterminado de la lambda cuando la lambda recibe solo un elemento
    lista.forEach{
        print("$it ")
    }
    println()
    //Lo de arriba es lo mismo que for each element of this list, print

    val cuadrados = lista.map { numero: Int ->
        numero * numero
    }

    println(cuadrados)

    //Limpia el contenido de una lista de acuerdo a los requerimientos contenidos en la función
    val pares = lista.filter {
        it % 2 == 0
    }

    println(pares)
}