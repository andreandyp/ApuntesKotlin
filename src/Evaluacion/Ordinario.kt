package Evaluacion

import classes.Estacion
import classes.Pintura
import classes.TransporteRuta
import classes.Usuario

class Ordinario(
    private val vagonesEnUso: Int = 8,
    override val estaciones: List<Estacion>,
    override var pintura: Pintura = Pintura.VERDE_CLARO
): TransporteRuta(){
    // Si alguien va a acceder a nuestras propiedades, es mejor dejarla pública
    var costo: Double = 4.0
        // Podemos usar get/set para establecer getters y setters personalizados
        // Con field nos referimos al propio campo
        get() {
            println("Costo")
            return field
        }
        set(nuevoCosto) {
            println("El costo subio a $nuevoCosto")
            field = nuevoCosto
        }

    override var tarifa: Double = costo

    // Si nadie va a acceder a la propiedad salvo la propia clase, mejor dejarla privada
    // También se pueden establecer settes pero no getters
    private var listaUsuarios = mutableListOf<MutableList<Usuario>>()

    // Si tenemos código que se use en todos los constructores, lo mejor es usar un bloque init
    init {
        for (i: Int in 0 until vagonesEnUso) {
            listaUsuarios.add(mutableListOf<Usuario>())
        }
    }

    // Necesitamos algún otro constuctor? Podemos añadir más con la palabra constructor
    // Pero a fuerzas tenemos que llamar al constuctor primario
    constructor(vagonesEnUso: Int, estaciones: List<Estacion>, pintura: Pintura, pasajeros: List<Usuario>) : this(
        vagonesEnUso = vagonesEnUso,
        estaciones = estaciones,
        pintura = pintura
    ) {
        this.listaUsuarios[0].addAll(pasajeros)
    }

    override fun abordar(usuario: Usuario) {
        println("Pagar $$tarifa")
        listaUsuarios[0].add(usuario)
        usuario.addBoleto()
        usuario.boleto?.let { API.listaBoletos.add(it) }
        if(usuario.obtenerSumaSerie(usuario.boleto) == 21){
            println("SUma 21")
            println(usuario.boleto)
            usuario.boleto?.let { API.listaBoletosBeso.add(it) }
        }
        else{
            println("NO suma 21")
        }

    }

    override fun descender(usuario: Usuario) {
        listaUsuarios[0].remove(usuario)
        usuario.removeBoleto()
    }
}