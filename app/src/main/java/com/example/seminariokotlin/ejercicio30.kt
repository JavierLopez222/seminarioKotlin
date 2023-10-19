package com.example.seminariokotlin

//Crea una función que, dado un número entero, devuelva True si es un número triangular (puede representarse como un triángulo equilátero de puntos), o False en caso contrario.

fun funcionTriangular(numero:Int): Boolean{
    var contador: Int = 0
    var suma: Int = 0
    while(suma < numero){
        contador++
        suma = contador * (contador + 1) / 2
    }
    return suma == numero
}

fun main(){
    var numeroAIntroducir: Int = 10
    var resultado = funcionTriangular(numeroAIntroducir)
    if(resultado){
        println("El número $numeroAIntroducir es triangular")
    }else{
        println("El número $numeroAIntroducir no es triangular")
    }
}
