package org.example

fun main(){

    var contador : Int = 10
    print("cuenta regresiva")
    while (contador > 0){
        print("\rCuenta regresiva $contador")
        Thread.sleep(1000)
        contador--}


}