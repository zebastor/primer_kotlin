package org.example
fun mostrarNombre(nombre:String, nombre2:String="", apellido:String){
    println("Usuario: $nombre $nombre2 $apellido")
}
fun main(){
    mostrarNombre("sebastian", "eso", "barreto")
    mostrarNombre(nombre="sebastian", apellido="barreto")
}