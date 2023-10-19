package com.example.seminariokotlin

//Crea una función que determine si un número dado es capicúa

fun esCapicua(numero: Int): Boolean{
    var nTexto = numero.toString()
    var nAlReves = nTexto.reversed()
    return nTexto == nAlReves
}

fun main(){
    var numero: Int =  2002
    if(esCapicua(numero)){
        println("El número $numero introducido anteriormente es capicúa")
    }else{
        println("El número $numero introducido anteriormente no es capicúa")
    }
}
