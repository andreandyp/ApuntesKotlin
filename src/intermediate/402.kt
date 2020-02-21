package intermediate

fun main(){
    //Destructuring ind.nombre <=> (nombre)
    var (nombre,edad,casado) = Individuo2("Arheli",18)
    println(nombre)
    println(edad)
    println(casado)






}

data class  Individuo2(val nombre: String, val edad : Int, var casado: Boolean = false)