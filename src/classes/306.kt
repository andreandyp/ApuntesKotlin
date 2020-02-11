package classes

import kotlin.random.Random

class Taxi2(override val pintura: Pintura):TransporteLibre{
    override var tarifa: Double = 8.74
    private var usuarioActual : Usuario? = null
    //Sirve solo para tipos de datos que no sean primitivos y no sean nulos
    private lateinit var tarifaDinamica:TarifaDinamica2
    private val COSTO_POR_TIEMPO = 1.07
    private var esDeNoche: Boolean = false
    var seguimiento : TrackListener? = null

    private val tarifaDeNoche :Double by lazy {
        API2.getNightRate()
    }

    override fun calcularTarifa(): Double {
        val costoFinal = (tarifa + COSTO_POR_TIEMPO) * tarifaDinamica.multiplicador
        return if(esDeNoche) costoFinal * tarifaDeNoche else costoFinal
    }

    override fun abordar(usuario: Usuario) {
        if(!::tarifaDinamica.isInitialized){
            tarifaDinamica = TarifaDinamica2(API2.getDynamicRate())
        }else{
            tarifaDinamica.multiplicador = API2.getDynamicRate()
        }
        usuarioActual = usuario

    }

    fun viajar(){
        seguimiento?.onStartRide("ESCOM")
        for ( i :Int in 0..10){
            seguimiento?.onChangeDirection("$i")
        }
    }

    override fun descender(usuario: Usuario) {
        seguimiento?.onEndRide("mi casa jijijiji")
        println("$${calcularTarifa()}")
        usuarioActual = null
    }

}

data class TarifaDinamica2(var multiplicador:Double){

}

object API2{
    fun getDynamicRate(): Double{
        return Random.nextDouble(0.0,5.0)
    }

    fun getNightRate() : Double = 0.20
}