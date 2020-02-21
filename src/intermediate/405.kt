package intermediate

fun main() {
    //Scoped functions
    //run(), let(), with()
    var latex = LaTeXProcessor("dy/dx x*x").run {
        format = "plain"
        html = true

        generarTextoLaTeX()
    }

    println(latex)

    //Una manera más fácil de representar la función comentada abajo
    //Recibimos el objeto a través de it y devuelve lo ultimo que está en lambda
    //Let no modifica solo lo usa
    var nombre:String? = null
    nombre?.let {
        println(it.capitalize())
    }?: println("No hay nombre")

    /*
    var nombre:String? = null
    if (nombre != null){
        println(nombre.capitalize())
    }
    else{
        println("No hay nombre")
    }

     */

    //with NO es función de extension a diferencia de las otras
    //Si vamos a usar valores nulos es mejor usar let
    var nombre2 = "itz"
    println(with(nombre2){
        capitalize()
    })

    //println(nombre2)
}