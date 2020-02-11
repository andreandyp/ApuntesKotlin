package classes

fun main(){
    val taxi = Taxi2(Pintura.ROSA)
    val itz = Usuario("Itzel",800)
    taxi.abordar(itz)
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
    taxi.descender(itz)
}