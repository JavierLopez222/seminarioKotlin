package com.example.seminariokotlin

//Crea una función que invierta una cadena de texto. Por ejemplo, "hola" debería convertirse en "aloh"

fun invertirCadena(texto: String): String{
    return texto.reversed()
}

fun main(){
    var texto: String = "Hola me llamo Javier"
    var textoInvertido = invertirCadena(texto)

    println(textoInvertido)
}

