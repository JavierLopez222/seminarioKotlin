package com.example.seminariokotlin

//Crea una función que dada una distancia en millas calcule su correspondiente en kms

fun conversor(millas: Double): Double{
    var unaMillaEnKM: Double = 1.60934
    return millas * unaMillaEnKM
}

fun main(){
    var distanciaMilla = 20.0
    var distanciaKM = conversor(distanciaMilla)
    println("La distancia de 20 millas en km es $distanciaKM")
}