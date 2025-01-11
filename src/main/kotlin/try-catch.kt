package org.example

fun main(){

    val nulo : String? = null

    try {
        /*no se recomienda usar el !! */
        nulo!!.length
    }catch (exception : Exception){
        println("El valor es nulo")}
}