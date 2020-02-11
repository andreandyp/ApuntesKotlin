package intermediate

fun main() {
    // Apply: aplicarle cambios a un objeto sin necesidad de introducir una nueva variable
    // La lambda permite acceder al objeto mediante this y no devuelve nada
    // Apply devuelve el propio objeto
    val solicitud: AJAXRequest = AJAXRequest().apply {
        setURL("google.com")
        setAsync(true)
        setCookies(listOf(""))
        setTimeout(1000L)

    }

    solicitud.send()

    // Also: realiza procesamiento al objeto
    // La lambda recibe el objeto mediante it y no devuelve nada
    // Also devuelve el propio objeto
    val itzel = Individuo("Itzel", 23, true).also {
        insertIntoDB(it)
    }
}

fun insertIntoDB(individuo: Individuo) {

}

class AJAXRequest {
    fun setURL(url: String) {

    }
    fun setAsync(async: Boolean){

    }
    fun setCookies(cookies: List<String>) {

    }
    fun setTimeout(ms: Long) {

    }
    fun send(): String {
        return "body"
    }
}