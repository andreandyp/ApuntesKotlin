package classes

import kotlin.random.Random

class Taxi(override val pintura: Pintura) : TransporteLibre {
    override var tarifa: Double = 8.74
    private val COSTO_POR_TIEMPO = 1.07
    private var esDeNoche = false
    private var aumentos = 0 // Las veces que el taxi aumenta la tarifa (cada 250 m o 45 s)
    var seguimiento: TrackListener? = null
    var usuarioActual: Usuario? = null

    // Si tenemos alguna propiedad variable que no podemos inicializar en este momento
    // Pero sabemos que va a ser inicializada en algún momento, utilizamos lateinit antes de var
    // Lateinit no sirve para valores primitivos
    private lateinit var tarifaDinamica: TarifaDinamica

    // by lazy: Cuando inicializaremos un valor de forma "tardía"
    // Si lo usamos, se va a ejecutar lo siguiente sólo la primera vez
    // Las siguientes veces sólo se recuperará el valor calculado
    private val tarifaDeNoche: Double by lazy {
        API.getNightRate()
    }

    override fun abordar(usuario: Usuario) {
        // Esto es para evitar algún memory-leak
        // Más detalles en Reflexión
        if(!::tarifaDinamica.isInitialized) {
            tarifaDinamica = TarifaDinamica(API.getDinamicRate())
        }

        usuarioActual = usuario
        tarifaDinamica.multiplicador = API.getDinamicRate()
    }

    fun viajar() {
        seguimiento?.onStartRide("Aquí")
        for (i: Int in 0..10) {
            ++aumentos
            seguimiento?.onChangeDirection("${usuarioActual!!.nombre} - $i")
        }
    }

    override fun descender(usuario: Usuario) {
        seguimiento?.onEndRide("Allá")
        usuarioActual = null
        println("Pagar $${calcularTarifa()}")
    }

    override fun calcularTarifa(): Double {
        val costoFinal = (tarifa + (COSTO_POR_TIEMPO * aumentos)) * tarifaDinamica.multiplicador
        return if(esDeNoche){
             costoFinal * tarifaDeNoche
        } else {
            costoFinal
        }
    }
}

data class TarifaDinamica(var multiplicador: Double)

// ¿Tenemos algún singleton (Cómo una conexión a una API o a una BD)?
// Es mejor usar object, será un objeto que tendrá sólo una instancia
object API {
    fun getDinamicRate(): Double {
        return Random.nextDouble(0.0, 5.0)
    }
    fun getNightRate(): Double {
        return 0.20
    }
}