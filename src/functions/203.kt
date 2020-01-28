package functions

fun main() {
    connectToDatabase2 ("test" ){ nombreDB:String, puerto:Int ->
        println("Conectado a $nombreDB en el puerto $puerto")
    }

    connectToDatabase2 ("test" ){ nombreDB:String, _ ->
        println("Conectado a $nombreDB")
    }

    val callback = {
        nombreBD: String, puerto : Int ->
        println("Conectado a BD $nombreBD")
        if(nombreBD == "produccion"){
            println("Alejen al becario")
        }


    }

    connectToDatabase2("produccion",callback)
}

//Lambda: Una función que recibe solo un parámetro
//El valor unit indica que lambda no regresa nada
fun connectToDatabase2(nombre :String, onConnected: (nombre:String, puerto:Int) -> Unit){
    if(nombre.isNotEmpty()){
        onConnected(nombre,1717)
    }
}

