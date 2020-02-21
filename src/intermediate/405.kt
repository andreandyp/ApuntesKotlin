package intermediate

fun main(){
    //Scoped Functions
    //run(),let(),with()
    val latex = LaTeXProcessor("dx/dy x^2").run{
        format = "plain"
        html = true
        generarTextoLaTeX()
    }
    println(latex)

    var nombre: String? = null

    /*
    if (nombre != null){
        println(nombre.capitalize())
    }else{
        println("no hay nombre")
    }
    */
    ///USO DE LET
    nombre?.let {
        println(it.capitalize())
    } ?: println("No hay nada")


    var nombre2 : String = "Arheli"
    //No aplica para valores nulos
    with(nombre2){
        capitalize()
    }
}