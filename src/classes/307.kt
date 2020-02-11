package classes

//Funciones de Extensión
/*
* Principo abierto cerrado
* Abiertas para extensión
* Cerradas para modificación
* *
* */
//Aqui estamos agregando a la clase la funcion mostrarEstacionActual
fun MetrobusBajo.mostrarEstacionActual2():String{
    var estacionActual = this.estaciones.filter { it.actual == true }
    return "Estamos en ${estacionActual[0].nombre}"

}
