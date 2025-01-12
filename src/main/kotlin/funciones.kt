package org.example

fun random(frase : String): String{
    val num_aleatorio = 0..77
    val resultado = num_aleatorio.random()
    return if(resultado.rem(2)==0){
        frase.toUpperCase()
    }
    else{
        frase.toLowerCase()
    }
}

fun mostrar_frase(frase: String){
    println("la frase es: $frase")
}

//funcion de extension
fun String.randomExtension(): String{
    val num_aleatorio = 0..77
    val resultado = num_aleatorio.random()
    return if(resultado.rem(2)==0){
        this.toUpperCase()
    }
    else{
        this.toLowerCase()
    }
}

fun main(){

    val frase_aleatoria = "Eso tilin vaya tilin wow tilin"

    mostrar_frase(random(frase_aleatoria))

    val frase2 = "Wasawdasfasfsas".randomExtension()
    mostrar_frase(frase2)

}