package org.example

fun main(){

    val numeros = listOf(1,2,3,4,5,6)
    with(numeros){ println("los numeros son $this")
    println("hay $size datos")
    }
}