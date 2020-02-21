package Evaluacion

fun Usuario.obtenSumaSerie(boleto : Int?):Int{
    var suma = 0
    var aux = 0
    var serie = boleto
    if (serie != null) {
        while (serie != 0) {
            aux = serie % 10
            serie /= 10
            suma += aux
        }
    }
    return suma
}
object API {
    var boletos = mutableListOf<Int?>()
    var boletoBeso = mutableListOf<Int?>()

    fun addBoleto(boleto: Int?){
        if (boleto != null)   boletos.add(boleto)
        else println()
    }
    fun addBoletoBeso(boleto: Int?){
        if (boleto!=null) boletoBeso.add(boleto)
        else println()
    }

}
/*
fun main(){
    var usu = Usuario("Laura",15.0,"Femenino",null)
    usu.addBoleto()
    var suma = usu.obtenSumaSerie(usu.Boleto)
    println(usu.Boleto)
    println(suma)


}*/