package com.example.seminariokotlin

//Crea una función que determine si una cadena de texto contiene solo caracteres alfabéticos (letras) y espacios en blanco.

fun funcion(cadena: String): Boolean{
    return cadena.all { it.isLetter() && it.isWhitespace() }
}

fun main(){
    var texto: String = "Hola me llamo javier"
    var resultado = funcion(texto)
    if(resultado){
        println("La frase del texto contiene solo letras y espacios")
    }else{
        println("Esta frase no contiene letras ni espacios")
        println("O no contiene letras pero si espacios")
        println("O no contiene espacios pero si letras")
    }
}