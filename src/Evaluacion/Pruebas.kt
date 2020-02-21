package Evaluacion

import classes.Estacion
import classes.Pintura
import classes.Usuario

fun main(){
    val pasajeros = listOf<Usuario>(
        Usuario("André", 100.0,"hombre",null),
        Usuario("Itzel", 100.0,"mujer",null),
        Usuario("Arheli", 100.0,"mujer",null)
    )
    val estaciones = listOf<Estacion>(
        Estacion("Aragon",false),
        Estacion("Cuatro caminos",true),
        Estacion("Santa Fe",true)
    )
    val Transporte = NocheBus(7,estaciones,Pintura.AZUL,pasajeros,"Vespertino")


    Transporte.abordar(pasajeros)
    Transporte.descender(pasajeros)
    println(API.listaBoletos)
    println(API.listaBoletosBeso)
}

