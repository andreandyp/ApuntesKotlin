package classes

// Así se declara una data class:
// data class Nombre(val/var campo: Tipo)
data class Estacion(val nombre: String, var actual: Boolean = false)
data class Usuario(val nombre: String, var dinero: Int = 0) {
    // Si queremos añadir métodos o añadir getters/setters a la clase
    // Lo podemos hacer en el cuerpo de la clase
    var saldo: Int = 0
    set(value) {
        field = value
        if (value > 120) {
            field = -1 // Tarjeta inválida
        }
    }
}

// Así definimos una enumeración
// enum class Nombre(val nombre: Tipo)
// El constructor es opcional, representa un valor primitivo
enum class Pintura {
    AZUL_CLARO, ROSA, VERDE, NARANJA, AZUL, VERDE_CLARO, ROJO, MORADO, BLANCO, MIX
}