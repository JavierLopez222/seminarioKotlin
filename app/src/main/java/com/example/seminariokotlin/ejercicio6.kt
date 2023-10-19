package com.example.seminariokotlin

//Crea una función que cuenta cuántas veces aparece una subcadena en un texto.

fun contadorSubcadenas(subcadena: String, texto: String): Int{
    return texto.windowed(subcadena.length,1).count{ it == subcadena}
}

fun main(){
    var texto = "Hola Javier, ¿Te puedo llamar Javier?"
    var subcadenaABuscar = "Javier"
    var contadorSubcadena = contadorSubcadenas(subcadenaABuscar, texto)

    println("La subcadena $subcadenaABuscar aparece $contadorSubcadena veces en el texto: $texto")
}