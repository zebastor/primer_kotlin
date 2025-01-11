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

    //ordenar listas
    var loteria = listOf(23,44,12,10,99)
    val loteriaSort = loteria.sorted()
    println(loteriaSort)

    loteria = loteria.shuffled()
    println("Lista random $loteria")

    // convertir lista de enteros a string

    val loteriaString = loteria.map { numero -> "$numero num" }
    println(loteriaString)

    val loteriaFiltrada = loteria.filter { numero -> numero > 30 }
    println(loteriaFiltrada)
}