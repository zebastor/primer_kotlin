package org.example

fun main(){
    val semana = listOf("Lun", "Mar", "Mier", "Jue", "Vie", "Sab", "Dom")
    for (dia in semana){
        print("\rEl dia es $dia")
        Thread.sleep(500)
    }
    semana.forEach{dia -> print("\rhoy es $dia"); Thread.sleep(1000) }

    val caracteres = semana.map { semana -> semana.length  }
    println(caracteres)

    val caracteresFiltro = caracteres.filter{caracteres -> caracteres >3}
    println(caracteresFiltro)
}