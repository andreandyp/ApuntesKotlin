package intermediate

data class Individuo2(val nombre:String, val edad:Int, var casado: Boolean = false){

}

fun main(){
    //Destructoring
    val individuo = Individuo2("Itzel",23,false)
    println(individuo.nombre)
    println(individuo.edad)
    println(individuo.casado)

    val (_, edad, casado) = Individuo2("Itz",23,false)
    //Todos aquellos que no usamos los podemos usar en guion bajo pero debe ser
    // el mismo orden para poder usarlos de la forma en que se visualiza arriba
    println(edad)
    println(casado)


}