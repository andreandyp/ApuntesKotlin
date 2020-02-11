package classes

class Metro2(private val vagonesEnUso : Int, val estaciones : List<String>, var pintura: String){
    var costo:Double = 5.0
    set(value) {
        println("El costo ahora es de $value")
        field = value
    }

    get() {
        return field
    }

    private var listaDeUsuario = mutableListOf<String>()
}