package Evaluacion


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