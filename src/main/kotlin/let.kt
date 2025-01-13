package org.example
//solo ejecuta codigo cuando no es null
fun let(nombre: String?=null){   nombre?.let {
        valor -> println("No es nulo es $valor")
}}
fun main(){

val nombre = "seb"
    let()
    let(nombre)
}