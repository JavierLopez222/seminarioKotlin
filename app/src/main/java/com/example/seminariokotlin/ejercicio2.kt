package com.example.seminariokotlin

//Crea una función que obtenga la sumatoria de una lista de números

fun sumaNumeros(lista: List<Int>): Int{
    var sumaNumeros: Int = 0
    for (numero in lista){
        sumaNumeros += numero
    }
    return sumaNumeros
}

fun main(){
    var listaNumeros = listOf<Int>(1,2,3,4,5,6,7,8)
    var resultado = sumaNumeros(listaNumeros)
    println("La suma de los números de la lista es $resultado")
}