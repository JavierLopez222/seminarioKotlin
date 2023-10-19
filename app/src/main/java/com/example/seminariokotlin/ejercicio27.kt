package com.example.seminariokotlin

//Crea una función que, dada una lista de palabras, devuelva la palabra más corta.

fun palabraMasCorta(palabras: List<String>): String?{
    var palabraCorta = palabras[0]
    for (palabra in palabras) {
        if (palabra.length < palabraCorta.length) {
            palabraCorta = palabra
        }
    }
    return palabraCorta
}

fun main(){
    var listaPalabras = listOf("apruebame", "caleidoscópio", " esternocleidomastoideo",)
    var resultado = palabraMasCorta(listaPalabras)
    println("La palabra mas corta es: $resultado")
}