package org.example

fun main(){

    var contador : Int = 10
    print("cuenta regresiva")
    while (contador > 0){
        print("\rCuenta regresiva $contador")
        Thread.sleep(1000)
        contador--}

    println("\nruleta")
    var rand : Int
    do {

        rand = (0..6).random()
        if (rand != 3)print("\rEl numero fue $rand")
        Thread.sleep(500)
    } while (rand != 3)
    println("\nEl numero fue $rand juego terminado")

}