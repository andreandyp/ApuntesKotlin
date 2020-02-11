package classes

class Metro2(private val vagonesEnUso: Int, val estaciones: List<String>, var pintura:String) {//constructor principal
    var costo: Double = 5.0

    set(nuevocosto){
        println("El costo ahora es de $nuevocosto")
        field = nuevocosto

    }
    get() {
        return field
    } //field palabra reservada

    private var listaDeUsuarios = mutableListOf<String>()



}
