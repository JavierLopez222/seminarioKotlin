package com.example.seminariokotlin

//Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci.

fun crearFibonacci(n: Int): Long{
    if (n <= 1){
        return n.toLong()
    }
    var prev = 0L
    var current = 1L

    for(i in 2..n){
        var next = prev + current
        prev = current
        current = next
    }
    return current
}

fun main(){
    var n = 10
    var resultado = crearFibonacci(n)
    println("El término $n de la sucesión de Fibonacci es $resultado")
}