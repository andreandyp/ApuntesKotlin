package basics

fun main() {
    // En Kotlin hay arreglos, listas, mapas y conjuntos
    // Arreglos: fijos, los datos pueden cambiar
    val arreglo = arrayOf<Int>(1, 2, 3)
    arreglo[0] = 2
    println(arreglo[0])

    // Listas: variables, se pueden modificar (según la implementación)
    // Se suele usar listas en vez de arreglos en Kotlin
    val lista = mutableListOf<Int>(1, 2, 3)
    lista.add(4)
    lista.set(0, 2)
    println("Lista")
    println(lista)
    println(lista.get(0))

    // Podemos usar el operador [] para acceder y asignar en la lista
    lista[0] = 1
    println("Operador []")
    println(lista)
    println(lista[1])

    // Mapas: estructura de datos clave/valor
    val mapa = mutableMapOf<String, String>()
    // También podemos usar el operador [] para asignar y acceder al mapa
    mapa["nombre"] = "Andy"
    mapa["apellidos"] = "P"
    println("Mapa")
    println(mapa)
    println(mapa["nombre"])

    // Conjuntos: "lista" con valores únicos, igual que un conjunto en las matemáticas
    val conjunto = mutableSetOf<Int>(1, 2, 2, 3)
    println(conjunto)
    conjunto.add(2)
    conjunto.add(4)
    println(conjunto)

    // Cuidado: estas estructuras de datos son diferentes en Java
    // Hay que realizar conversiones al utilizar la interoperabilidad con Java
}