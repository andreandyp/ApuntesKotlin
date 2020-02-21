package intermediate

fun main(){
    //Scoped functions
    //apply() , also()

    val ajax = AJAXRequest().apply {
        setURL("gloogle.com")
        setCookies(listOf("user", "845247865393"))
        setAsync(true)
        setTimeout(1000L)

    }
    //also recibe el objeto como it
    val ind2 = Individuo("Arheli",22,false).also {

        insertIntoDB(it)

    }



    ajax.send()
}