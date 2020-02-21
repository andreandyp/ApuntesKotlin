package Evaluacion

import kotlin.random.Random


data class Usuario(val nombre: String, var dinero: Double = 0.0, var sexo : String , var Boleto : Int?=0 ) {
    // Si queremos añadir métodos o añadir getters/setters a la clase
    // Lo podemos hacer en el cuerpo de la clase
    var saldo: Double = 0.0
        set(value) {
            field = value
            if (value > 120) {
                field = -1.0 // Tarjeta inválida
            }
        }
    fun addBoleto () {
        this.Boleto = Random.nextInt(1000,9999)

    }
    fun removeBoleto() {
        this.Boleto = null
    }
}
/*
fun main(){
    var usuario = Usuario("Arheli",15.0,"Femenino",null)

    usuario.addBoleto()

    print(usuario.Boleto.toString())

    usuario.removeBoleto()

    print(usuario.Boleto.toString())


}*/