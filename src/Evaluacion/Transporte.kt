package Evaluacion



interface Transporte {
    // Podemos tener atributos y métodos que otras clases sobreescribirán
    var tarifa: Double
    val pintura: Pintura
    fun abordar(usuario: Usuario)
    fun descender(usuario: Usuario)
}