package org.example

fun main(){

    val vocales = listOf("a", "e", "o")
    println(vocales)

    val listavacia = mutableListOf<String>()
    println(listavacia)

    listavacia.addAll(listOf("lo", "n"))
    println(listavacia)

    val obtenerGet = listavacia.get(0)
    println(obtenerGet)

    val obtenerOperador = listavacia[0]
    println(obtenerOperador)

    listavacia.removeIf{caracteres -> caracteres.length > 1}
    println(listavacia)
}