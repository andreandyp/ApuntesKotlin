package classes

import kotlin.random.Random

class Taxi2(override val pintura: Pintura): TransporteLibre {

    override var tarifa: Double = 8.64
    val COSTO_POR_TIEMPO = 1.07
    var usuarioActual : Usuario? = null
    private  var esDeNoche : Boolean = false

    private lateinit var tarifaDinamica: TarifaDinamica2 // Solo Tipos de datos no primitivos, al no saber el tipo de dato al momento de
                                                        //declararlo
    private val tarifaDeNoche : Double by lazy{ API2.getNightRate() }  //variable tardía, se ejecute una vez se utilice
    var seguimiento: TrackListener? = null

    override fun calcularTarifa(): Double {
        val costoFinal = (tarifa + COSTO_POR_TIEMPO)*tarifaDinamica.multiplicador
        return if (esDeNoche) costoFinal * tarifaDeNoche else costoFinal

    }


    override fun abordar(usuario: Usuario) {
        if(!::tarifaDinamica.isInitialized) {
            tarifaDinamica = TarifaDinamica2(API2.getDinamicRate())
        }else{
            tarifaDinamica.multiplicador = API2.getDinamicRate()
        }
        usuarioActual = usuario

    }
    fun viajar (){
        seguimiento?.onStartRide("ESCOM")
        for (i: Int in 0..10){
            seguimiento?.onChangeDirection("$i")
        }
    }

    override fun descender(usuario: Usuario) {
        seguimiento?.onEndRide("mi destino ")
        println("Pagar : ${calcularTarifa()}")
        usuarioActual = null

    }


}



data class  TarifaDinamica2(var multiplicador:Double){

}

//Object: clase que sólo se va instanciar una vez
object API2{
    fun getDinamicRate (): Double {
        return Random.nextDouble(0.0,5.0)
    }
    fun getNightRate():Double = 0.20

}