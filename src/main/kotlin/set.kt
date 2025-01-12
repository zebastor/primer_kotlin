package org.example

fun main(){

    val datos_repetidos = setOf("q", "q", "b", "B", "b","q","a")
    println(datos_repetidos)

    val letras_repetidas = mutableSetOf("q", "q", "b", "B", "b","q","a")
    letras_repetidas.add("s")
    println(letras_repetidas)
    letras_repetidas.remove("a")
    println(letras_repetidas)

    println(letras_repetidas.firstOrNull{letra -> letra == "o"})
}