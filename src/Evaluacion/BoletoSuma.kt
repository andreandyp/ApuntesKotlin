package Evaluacion

import classes.Usuario
import kotlin.random.Random

fun Usuario.obtenerSumaSerie(boleto:Int?):Int{
    var suma = 0
    var aux = 0
    var serie = boleto
    if(serie != null){
        while (serie != 0 ){
            aux = serie % 10
            serie /= 10
            suma += aux
        }
    }
    return suma
}

fun Usuario.addBoleto(){
    this.boleto = Random.nextInt(1000,9999)
}

fun Usuario.removeBoleto(){
    this.boleto = null
}

object API{
    var listaBoletos = mutableListOf<Int>()
    fun getBoletos(): List<Int>{
        //listaBoletos.add(boleto)
        return listaBoletos
    }

    var listaBoletosBeso = mutableListOf<Int>()
    fun getBoletosBeso():List<Int>{

        return listaBoletosBeso
    }
}