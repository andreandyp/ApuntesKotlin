package classes

interface Transporte2{
    val tarifa: Double
    val pintura: Pintura
    fun abordar(usuario:Usuario)
    fun descender(usuario:Usuario)

}
interface  TransporteRuta2: Transporte{
    val estaciones : List<Estacion>
    fun abordar(Usuario: List<Usuario>)
    fun descender(Usuario: List<Usuario>)

}