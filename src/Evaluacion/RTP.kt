package Evaluacion


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
    //------------------------------------------------
    /*
    val estacionesAT = mutableListOf<Estacion>(
        Estacion("Instituto del petroleo", true),
        Estacion("Taxqueña", false)
    )
    var atenea = Atenea(estaciones = estacionesAT)
    atenea.abordar(usuario)
    atenea.abordar(usuario2)
    atenea.abordar(usuario3)

    //------------------------------------------------
    val estacionesO = mutableListOf<Estacion>(
        Estacion("Instituto del petroleo", true),
        Estacion("Taxqueña", false)
    )
    var ordinario = Ordinario(estaciones = estacionesO)
    ordinario.abordar(usuario)
    ordinario.abordar(usuario2)
    ordinario.abordar(usuario3)
    */


}

