package classes

/*
* Realmente este archivo no forma parte de las clases, pero lo pongo aquí para entender mejor el funcionamiento
* de los ejemplos
* */
fun main() {
    val pasajeros = listOf<Usuario>(
        Usuario("André", 100.0),
        Usuario("Itzel", 100.0),
        Usuario("Arheli", 100.0)
    )
    val estaciones =
        listOf<Estacion>(
            Estacion("Cuatro caminos", false),
            Estacion("Zócalo", false),
            Estacion("Taxqueña", true)
        )
    val metroL2 = Metro(9, estaciones, Pintura.NARANJA, pasajeros)
    //metroL2.abordar(pasajeros)

    val zocalo = Estacion("Zocalo", true)
    val zocalo2 = Estacion("Zocalo", true)

    println(zocalo == zocalo2)

    val arheli = Usuario("Arheli", 0.0)
    arheli.saldo = 125.0
    println(arheli.saldo)

    val estacionesTrole = listOf<Estacion>(
        Estacion("Instituto del petroleo", true),
        Estacion("Taxqueña", false)
    )
    val trole1 = TrolebusEjeCentral(estacionesTrole, 4.0, Pintura.AZUL)

    val trole2 = TrolebusPolitecnico(estacionesTrole, 2.0, Pintura.AZUL)

    val trole = Trolebus(estacionesTrole, 4.0, Pintura.AZUL)

    trole1.abordar(pasajeros)
    trole2.abordar(pasajeros)

    var saludo = "Estoy viajando en "
    val tipoTrole = when(trole) {
        is TrolebusEjeCentral -> " eje central"
        is TrolebusPolitecnico -> " el poli"
        else -> " otro"
    }

    val mb = MetrobusReforma(estacionesTrole, Pintura.ROJO)
    ponerEnFuncionamiento(mb)

    println(saludo + tipoTrole)

    val taxi = Taxi(Pintura.ROSA)
    val andy = Usuario("Andy", 0.0)
    taxi.abordar(andy)
    taxi.seguimiento = object : TrackListener {
        override fun onStartRide(start: String) {
            println(start)
        }

        override fun onChangeDirection(direction: String) {
            println(direction)
        }

        override fun onEndRide(end: String) {
            println(end)
        }
    }

    taxi.viajar()
    taxi.descender(andy)

    println(mb.mostrarEstacionActual())

    println("hola".decapitalize())

    println("Nunca te voy a ser infiel".toSarcasm())
}

// Cuando la clase es sellada, no es necesario poner un else al when
fun ponerEnFuncionamiento(mb: MetrobusBajo): String {
    return when(mb) {
        is MetrobusReforma -> " reforma"
        is MetrobusComplementario -> " colonias feas"
        is MetrobusCentro -> " el centro"
    }
}