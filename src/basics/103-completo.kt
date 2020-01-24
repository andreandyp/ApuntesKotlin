package basics

// Todos los métodos regresan Unit a menos que se especifique lo contrario
// No es necesario poner Unit como retorno
// Unit es igual que void en Java
fun main(): Unit {

}

// Todas las clases heredan de Any a menos que se especifique lo contrario
// No es necesario poner que hereda de Any
// Any es la superclase de Kotlin, igual que Object en Java
class Cosa : Any() {

}

// Nothing sirve para indicar cuando un método no va a regresar nunca
fun metodo(): Nothing {
    throw Exception()
}