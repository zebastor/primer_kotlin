package org.example

fun main(){

    var notas_estudiantes = mapOf(
        "Sebastian" to 3.4,
        "Nicolas" to 2.2,
        "Julian" to 1.7

    )
    val notas_estudiantes2 = mutableMapOf(
        "Sebastian" to 3.4,
        "Nicolas" to 2.2,
        "Julian" to 1.7

    )
    println(notas_estudiantes)
    println(notas_estudiantes2)

    //Para poder agregar se debe utilizar mutablemap
    notas_estudiantes2.put("Ximena", 2.6)
    notas_estudiantes2["Wilson"]= 3.0
    println(notas_estudiantes2)
    //para buscar elementos
    val find = notas_estudiantes2["Sebastian"]
    println(find)

    notas_estudiantes2.remove("Wilson")
    println(notas_estudiantes2)
    println(notas_estudiantes2.keys)
    println(notas_estudiantes2.values)
}