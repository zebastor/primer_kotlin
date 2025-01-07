package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    val pi : Double=5.123456789
    println("El valor de pi es $pi")

    //Float solo puede mostrar 7 decimales
    var pi2 : Float = 3.12345678F
    println("El valor de pi2 es $pi2")

    var resta = pi - pi2
    println(" valor resta $resta")

    //operadores mediante funciones
val x = 2
val y = 5

    println(x.minus(y))

    println(x.plus(y))

    println(x.times(y))

    println(x.div(y))

    println(x.rem(y))

    println(x.inc())

    println(x.dec())


    println(x.compareTo(y))

    println(y.compareTo(x))

    println(x.equals(y))
println("Escribe el nombre: ")
    val nombre: String = readln()

    if (nombre.isNotEmpty()) {
        println("El largo del nombre es ${nombre.length}")
    } else println("El nombre es vacio")
}

























