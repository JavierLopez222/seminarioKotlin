package com.example.seminariokotlin

//Crea una función que, dada una lista de palabras, devuelva la palabra más larga.

fun palabraMasLarga(palabras: List<String>): String?{
    var palabraLarga = palabras[0]
    for (palabra in palabras) {
        if (palabra.length > palabraLarga.length) {
            palabraLarga = palabra
        }
    }
    return palabraLarga
}

fun main(){
    var palabrasAIntroducir = listOf("hola", "pato", "apruebame", "porfa")
    var resultado = palabraMasLarga(palabrasAIntroducir)

    println("La palabra mas larga de la lista introducida anteriormente es: $resultado")
}