package basics

fun main() {
    // En Kotlin hay una diferencia entre estructuras mutables e inmutables
    val listaMutable = mutableListOf<Int>(1, 2, 3)
    listaMutable.add(4)

    val listaInmutable = listOf<Int>(4, 5, 6)
    // La línea siguiente no funciona
    //listaInmutable.add(7)

    val mapaMutable = mutableMapOf<String, String>()
    mapaMutable["nombre"] = "Andy"

    val mapaInmutable = mapOf<String, String>()
    // La línea siguiente no funciona
    //mapaInmutable.put("nombre", "Andy")

    val setMutable = mutableSetOf<Int>(7, 8, 9)
    setMutable.add(9)

    val setInmutable = setOf<Int>(10, 11, 11, 12)
    // La línea siguiente no funciona
    //setInmutable.add(12)
}