
package Evaluacion


import kotlin.random.Random


class Atenea(
    override var tarifa: Double = 4.0,
    override val pintura: Pintura = Pintura.ROSA,
    override val estaciones: List<Estacion>)
    : TransporteRuta() {
    private var listaUsuarios = mutableListOf<Usuario>()

    // Con el modificador override sobreescribimos métodos
    override fun abordar(usuario: Usuario) {
        println("==========Bienvenido a ATENEA========")
        println("Pagar $$tarifa")
        if (usuario.dinero < tarifa) println("No cuentas con saldo suficiente")
        else {
            usuario.saldo = usuario.dinero - tarifa
            if (usuario.sexo == "Femenino") {
                listaUsuarios.add(usuario)
                usuario.addBoleto()
                println("Su numero de Boleto es: ${usuario.Boleto}")
                API.addBoleto(usuario.Boleto)
                if (usuario.obtenSumaSerie(usuario.Boleto) == 21) {
                    API.addBoletoBeso(usuario.Boleto)
                    println("Felicidades ! tu boleto  suma 21")
                } else println()

            } else {
                println("Lo sentimos no puede entrar")
            }
        }
    }

    override fun descender(usuario: Usuario) {
        if (usuario.sexo.equals("Femenino")){
            usuario.removeBoleto()
            listaUsuarios.remove(usuario)
            println("Adios ${usuario.nombre} ")

        }else println("El usuario no abordo")


    }
}


