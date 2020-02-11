package classes

// ¿Queremos hacer una clase que pueda heredar a otras pero conociendo las subclases? (útil para when)
// Utilizamos sealed como modificador
sealed class MetrobusBajo(
    override val estaciones: List<Estacion>,
    override val pintura: Pintura = Pintura.ROJO
) : TransporteRuta() {
    // Con protected, sólo nuestras subclases pueden ver este atributo
    protected var listaUsuarios = mutableListOf<Any>()
    override var tarifa: Double = 6.0
    var number : Double = 0.0

    override fun abordar(usuario: Usuario) {
        println("Cobrar $$tarifa")
        listaUsuarios.add(usuario)
    }

    override fun descender(usuario: Usuario) {
        println("Descender usuario")
        listaUsuarios.remove(usuario)
    }
}

class MetrobusReforma(
    override val estaciones: List<Estacion>,
    override val pintura: Pintura
) :
    // Llamamos al constuctor de la superclase así
    MetrobusBajo(estaciones, pintura) {

    init {
        listaUsuarios.add(mutableListOf<Usuario>()) // La fila de abajo
        listaUsuarios.add(mutableListOf<Usuario>()) // La de arriba
    }

    // Podemos incluso sobreescribir métodos ya sobreescritos
    override fun abordar(usuario: Usuario) {
        // Con súper llamamos a atributos y métodos de la superclase
        super.abordar(usuario)
        println("El usuario puede subir arriba si hay lugares")
    }
}

class MetrobusCentro(
    override val estaciones: List<Estacion>,
    override val pintura: Pintura
) : MetrobusBajo(estaciones, pintura)

class MetrobusComplementario(
    override var tarifa: Double,
    override val estaciones: List<Estacion>,
    override val pintura: Pintura
) : MetrobusBajo(estaciones, pintura) {
    override fun descender(usuario: Usuario) {
        super.descender(usuario)
        println("Pide tu boleto para descuento")
    }
}