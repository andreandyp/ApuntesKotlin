package Evaluacion

class Ordinario (
    override var tarifa: Double =  4.0,
    override val pintura: Pintura = Pintura.VERDE,
    override val estaciones: List<Estacion>


) : TransporteRuta() {

    private var listaUsuario = mutableListOf<Usuario>()

    override fun abordar(usuario: Usuario) {
         println("===============Bienvenido al RTP ========")
         println("Pagar : $tarifa")
        if (usuario.dinero < tarifa) println("No cuentas con saldo suficiente")
        else {
            usuario.saldo = usuario.dinero - tarifa
             listaUsuario.add(usuario)
             usuario.addBoleto()
             API.addBoleto(usuario.Boleto)
             if (usuario.obtenSumaSerie(usuario.Boleto) == 21) {
                 println("Felicidades tu boleto suma 21")
                 API.addBoletoBeso(usuario.Boleto)
             } else println()
         }

    }

    override fun descender(usuario: Usuario) {
        println("Adios ${usuario.nombre}")
        listaUsuario.remove(usuario)
    }
}