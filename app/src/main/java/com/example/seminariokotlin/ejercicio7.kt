package com.example.seminariokotlin

//Crea una función que pone en mayúscula la primera letra de cada palabra de un texto

fun mayusculaLetras(texto: String): String{
    var palabras = texto.split(" ")
    var palabrasTransformadas = palabras.map{ it.capitalize()}
    return palabrasTransformadas.joinToString { " " }
}

fun main(){
    var texto: String = "hola me llamo javier"
    var textoTransformado: String = mayusculaLetras(texto)

    println("Este es el texto original introducido anteriormente: $texto")
    println("Este es el nuevo texto donde se transforma la primera letra de cada palabra en mayúscula: $textoTransformado")
}
