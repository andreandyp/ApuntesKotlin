package classes

// Para permitir que la clase tenga subclases, utilizamos open
// En Kotlin, todas las clases son finales a menos que les indiquemos lo contrario
open class Trolebus(
    // En el mismo constructor podemos sobreescribir parámetros
    override val estaciones: List<Estacion>,
    override var tarifa: Double,
    override val pintura: Pintura
) :
    TransporteRuta() {
    private var listaUsuarios = mutableListOf<Usuario>()

    // Con el modificador override sobreescribimos métodos
    override fun abordar(usuario: Usuario) {
        println("Pagar $$tarifa")
        listaUsuarios.add(usuario)
        println("Dar boleto")
    }

    override fun descender(usuario: Usuario) {
        listaUsuarios.remove(usuario)

    }
}

class TrolebusPolitecnico(
    override val estaciones: List<Estacion>,
    override var tarifa: Double,
    override val pintura: Pintura
) : Trolebus(estaciones, tarifa, pintura)

class TrolebusEjeCentral(
    override val estaciones: List<Estacion>,
    override var tarifa: Double,
    override val pintura: Pintura
) : Trolebus(estaciones, tarifa, pintura)