package Evaluacion

import classes.Estacion
import classes.Pintura
import classes.Usuario

fun main() {
    val andy = Usuario("Andy", 120.0, "masculino", null)
    val estaciones = listOf<Estacion>(
        Estacion("Aragon", false),
        Estacion("Cuatro caminos", true),
        Estacion("Santa Fe", true)
    )
    val ordinario = Ordinario(8, estaciones, Pintura.VERDE_CLARO)
    ordinario.abordar(andy)
    println(andy.boleto != null)
    ordinario.descender(andy)
    println(andy.boleto == null)

    val nocheBus = NocheBus(8, estaciones, Pintura.AZUL, "Vespertino")
    nocheBus.abordar(andy)
    println(andy.boleto != null)
    nocheBus.descender(andy)
    println(andy.boleto == null)

    val itzel = Usuario("Itzel", 100.0, "mujer", null)
    val atenea = Atenea(8, estaciones, Pintura.ROSA)
    atenea.abordar(itzel)
    println(itzel.boleto != null)
    atenea.abordar(andy)
    println(andy.boleto)
    atenea.descender(itzel)
    println(itzel.boleto == null)

    println(API.getBoletos())
    println(API.getBoletosBeso())

    val lista = listOf<Pair<Int, Boolean>>(Pair(7770, true), Pair(2222, false))
}