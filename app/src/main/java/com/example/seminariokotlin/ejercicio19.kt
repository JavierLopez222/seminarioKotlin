package com.example.seminariokotlin

//Crea una función que, dada una cadena de texto, elimine todas las
//vocales de la cadena

fun fueraVocales(texto: String): String{
    var vocalesFuera = "[aeiouAEIOU]".toRegex()
    return texto.replace(vocalesFuera, "")
}
fun main(){
    var textoEjemplo: String = "Hola me llamo javier"
    var resultado = fueraVocales(textoEjemplo)
    println("El texto original es: $textoEjemplo")
    println("El texto con las vocales eliminadas es: $resultado")
}