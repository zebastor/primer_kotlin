package org.example

fun main(){
//Evita exceptions

    val nombres = mutableListOf("juan sebastian", "sebastian", "juan nicolas", "nicolas").apply {

        removeIf { nombre -> nombre.contains("juan") }
    }
    println(nombres)
//convierte tipos nullables a no nullables
    val color : MutableList<String>? = mutableListOf("blanco", "negro", "rojo")
    color?.apply { println("mostrar colores $this"); println("hay $size elementos") }
}