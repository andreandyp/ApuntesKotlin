package classes

fun main(){
    //print("hola mundo")

    val taxi = Taxi2(Pintura.ROSA)
    val usu = Usuario("Arheli",12)
    taxi.abordar(usu)
    taxi.seguimiento = object : TrackListener{
        override fun onStartRide(start: String) {
            println(start)
        }

        override fun onChangeDirection(direction: String) {
            println(direction)
        }

        override fun onEndRide(end: String) {
            println(end)
        }
    }
    taxi.viajar()
    taxi.descender(usu)
}