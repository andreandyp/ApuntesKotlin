package intermediate

class Clase {
    // Si tenemos métodos o propiedades estáticas, usamos companion objects para acceder a ellos
    // El companion object puede tener nombre o no
    // Sólo se puede tener un companion object por clase
    companion object {
        val cosa: Int = 0

        fun metodo1() {
            println("Metodo 1")
        }

        // Sin embargo, si queremos que sea también estático en Java, necesitamos anotar el método/la propiedad con
        // la anotación @JvmStatic
        @JvmStatic
        fun metodo2() {
            println("Método 2")
        }

        // Cuando tenemos un valor constante, también podemos usar const val
        // Ojo: val pueden ser constantes definidas en tiempo de compilación o de ejecución
        // Mientras que las constantes const sólo pueden ser definidas en tiempo de compilación
        // Las constantes solo pueden estar dentro de companion objects
        const val CONSTANTE: Int = 42
    }

    // Diferencia entre val y const val:
    // Las val van a convertirse en valores finales con getters, mientras que las const val serán públicas
    val PROPIEDAD: Int = 17
    fun main(args: Array<String>) {
        // Podemos acceder a las propiedades y métodos estáticos como en Java
        Clase.metodo1()

        // O con el nombre del objeto. Si el companion object no tiene nombre, utilizamos Companion
        // (En Java, a fuerzas tenemos que usar Companion o el nombre del companion object si la propiedad
        // o el método no está anotado con @JvmStatic)
        Clase.Companion.metodo2()
    }
}
