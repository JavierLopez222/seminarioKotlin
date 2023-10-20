package com.example.seminariokotlin

//Crea una función que dada una lista de números, devuelva una nueva
//lista con solo los números pares

fun numerosPares(lista: List<Int>): List<Int>{
    var devolverPares = lista.filter { it % 2 == 0 }
    return devolverPares
}

fun main(){
    var listaEjemplo = listOf<Int>(1,2,3,4,5,6,7,8,9)
    var resultado = numerosPares(listaEjemplo)
    println("Los números pares de la lista anterior son $resultado")
}