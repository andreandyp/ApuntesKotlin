package intermediate

fun main() {
    // Run: Vamos a calcular un objeto y devolveremos el resultado calculado
    // La lambda permite acceder al objeto mediante this
    // Run devuelve el último valor de la lambda
    val latexHtml: String = LaTeXProcessor("a^2 + 2ab + b^2").run {
        format = "plain"
        html = true

        generarTextoLaTeX()
    }

    println(latexHtml)

    // Let: útil para "hacer algo" con un objeto que puede ser nulo
    // Realmente sirve para limitar el alcance de las variables
    // La lambda recibe el objeto mediante it
    // Let devuelve el último objeto de la lambda
    val nombre: String? = "andy"
    val capitalizado = nombre?.let {
        nombre.capitalize()
    }

    println(capitalizado)
}

class LaTeXProcessor(var expresion: String) {
    lateinit var format: String
    var html: Boolean = true

    fun generarTextoLaTeX(): String {
        if(format != "plain") {
            return "format not supported"
        }
        return if(html){
            "<html>\\$expresion\\</html>"
        }
        else{
            "\\$expresion\\"
        }

    }
}