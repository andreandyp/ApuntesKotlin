package intermediate
//Const val solo puede estar en un companion object o en la parte de abajo de los package de un archivo (Afuera de todo)

const val  VALOR:Int = 42//Funciona con valores primitivos
class Clase2{
    companion object{
        val cosa: Int = 10

        fun metodo1(){
            println("Metodo1")
        }

        @JvmStatic
        fun metodo2(){
            println("Metodo2")
        }

        val VALOR: Int = 42//Funciona con valores que se asignan a lo largo del recorrido del código y que no son primitivos
        //La diferencia entre val que esta definida en tiempo de ejecucion y
        // compilacion y const val está definido en tiempo de compilación

        fun main(args: Array<String>){
            Clase2.cosa
            Clase2.Companion.metodo2()
            Clase.metodo2()
            //Nota: Casi no se ocupa companion en Kotlin donde más se ocupa es en JAVA
        }
    }
}