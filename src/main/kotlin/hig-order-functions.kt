package org.example
fun high(valorInicial: String, block : (String) ->Int): Int {return block(valorInicial) }

fun functionInception(nombre: String): ()-> String{return {"mostrando $nombre dentro de lamda"}}
fun main(){

    val valorInicial = high("hola", {valor -> valor.length})
    println(valorInicial)

    val lamda: () -> String = functionInception(nombre = "Seastian")
    val valorlamda: String = lamda()
    println(valorlamda)
}