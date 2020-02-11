package classes

// Así se definen las interfaces en Kotlin
// interface Nombre
interface Transporte {
    // Podemos tener atributos y métodos que otras clases sobreescribirán
    var tarifa: Double
    val pintura: Pintura
    fun abordar(usuario: Usuario)
    fun descender(usuario: Usuario)

}

// Así definimos una clase abstracta
// abstract class Nombre : ClaseQueHereda(), InterfazQueHereda1, InterfaQueHereda2, ...
// Puede ser opcional lo que herede
abstract class TransporteRuta : Transporte {
    // Podemos tener atributos y métodos abstractos (que otra clase implementará)
    abstract val estaciones: List<Estacion>

    // Y también atributos y métodos que nosotros implementamos
    fun abordar(usuarios: List<Usuario>) {
        for (usuario in usuarios) {
            this.abordar(usuario = usuario)
        }
    }

    fun descender(usuarios: List<Usuario>) {
        for (usuario in usuarios) {
            this.descender(usuario = usuario)
        }
    }
}

interface TransporteLibre : Transporte {
    fun calcularTarifa(): Double
}

interface TrackListener {
    fun onStartRide(start: String)
    fun onChangeDirection(direction: String)
    fun onEndRide(end: String)
}