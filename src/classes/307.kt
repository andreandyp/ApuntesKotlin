package classes

//Extention functions

//OPen-close principle
//Open to extention
//close to modification
fun MetrobusBajo.mostrarEstacionActual2():String{
    val estacionActual = this.estaciones.filter {
        it.actual == true
    }

    return "Estamos en ${estacionActual[0].nombre}"
}