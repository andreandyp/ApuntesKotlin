package intermediate

fun main() {
    //Scoped funtions: Funciones de alcance
    //apply(),also()

    val ajax = AJAXRequest().apply {
        setURL("google.com")
        setCookies(listOf("user","42854652158"))
        setAsync(true)
        setTimeout(1000L)
    }

    val individuo = Individuo("Itz",22,false).also {
        insertIntoDB(it)
    }


    ajax.send()

}