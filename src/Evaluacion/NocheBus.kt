package Evaluacion

import kotlin.String as String

class NocheBus : TransporteRuta {
    override val estaciones: List<Estacion>
    val turno: String
    override var tarifa: Double
    override val pintura: Pintura

    constructor(estaciones: List<Estacion>, turno: String,tarifa: Double = 7.0, pintura: Pintura = Pintura.AZUL) : super() {
        this.estaciones = estaciones
        this.turno = turno
        this.tarifa = tarifa
        this.pintura = pintura
        this.listaUsuario = mutableListOf<Usuario>()
    }

    private var listaUsuario: MutableList<Usuario>

    override fun abordar(usuario: Usuario) = if (turno.equals("Vespertino")) {
        println("==========Bienvenido a Noche Bus=======")
        println("Pagar : $tarifa")
        if (usuario.dinero < tarifa) println("No cuentas con saldo suficiente")

        else {
            usuario.saldo = usuario.dinero - tarifa
            listaUsuario.add(usuario)
            usuario.addBoleto()
            API.addBoleto(usuario.Boleto)
            //usuario.Boleto = 6663
            println("Su numero de Boleto es: ${usuario.Boleto}")
            if (usuario.obtenSumaSerie(usuario.Boleto) == 21) {
                API.addBoletoBeso(usuario.Boleto)
                println("Felicidades ! tu boleto  suma 21")
            } else println()
        }

    }else println("Solo en la Noche")

    override fun descender(usuario: Usuario)=if (turno.equals("Vespertino")){
        listaUsuario.remove(usuario)
        usuario.removeBoleto()
        println("\n -----Adios ${usuario.nombre}")
    }else println("El usuario no abordo")

}

fun main(){
     val estacionesNB = mutableListOf<Estacion>(
         Estacion("Instituto del petroleo", true),
         Estacion("Taxqueña", false)
     )
     var nocheBus = NocheBus(estacionesNB,"Vespertino")
     val usuario = Usuario("Arheli",15.0,"Femenino",null)
     val usuario2 = Usuario("Itzel",15.0,"Femenino",null)
     val usuario3 = Usuario("André",15.0,"Masculino",null)
     nocheBus.abordar(usuario)
     nocheBus.abordar(usuario2)
     nocheBus.abordar(usuario3)

     println(API.boletos)
     println(API.boletoBeso)
     //nocheBus.descender(usuario)



}