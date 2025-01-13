package org.example

fun main(){
//Evita exceptions

    var nombres = mutableListOf("juan sebastian", "sebastian", "juan nicolas", "nicolas").apply {

        removeIf { nombre -> nombre.contains("juan") }
    }
    println(nombres)
//convierte tipos nullables a no nullables
    val color : MutableList<String>? = mutableListOf("blanco", "negro", "rojo")
    color?.apply { println("mostrar colores $this"); println("hay $size elementos") }
    //permite modificar la variable para poderla usar como parametro
    nombres.also { List -> println("el valor de la lista es $nombres") }.asReversed().also { nombres = it }
    println("lista inversa $nombres")
}