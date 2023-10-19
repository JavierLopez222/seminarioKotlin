package com.example.seminariokotlin

//Crea una función que calcule el factorial de un número

fun calcularFactorial(numero: Int): Long{
    var factorial: Long = 1
    for(i in 1..numero){
        factorial *= 1
    }
    return factorial
}

fun main(){
    var numero: Int = 6
    var resultado = calcularFactorial(numero)

    println("El factorial del número $numero es $resultado")
}

